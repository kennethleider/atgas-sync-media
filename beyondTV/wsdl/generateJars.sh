#/bin/bash
wsdlFiles=$*

cd $(dirname $0)
if [ -z "$wsdlFiles" ]
then
   wsdlFiles=$(ls *.asmx)
fi

srcdir=../generated_src
createJar()
{
    wsdlFile=$1
    root=$(basename ${wsdlFile%.*})
    url="http://localhost:8129/wsdl/$root.asmx"
    package=$(echo $root | tr '[A-Z]' '[a-z]')    

    wsdlURL=file:$(cd $(dirname $wsdlFile); pwd)/$(basename $wsdlFile)
    cat bindingTemplate.jxb | sed "s|@package@|${package}|g" | sed "s|@wsdl@|$wsdlURL|g" > $TMPDIR/bindings.jxb
    wsimport -b $TMPDIR/bindings.jxb -s $srcdir -wsdllocation "$url" $wsdlFile
}

rm -rf $srcdir
mkdir $srcdir
for file in $wsdlFiles
do
   createJar $file
done