package org.atgas.sync.boxee;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


/**
 * The persistent class for the ACTORS database table.
 * 
 */
@Entity
@Table(name="ACTORS")
public class Actor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="\"idActor\"")
	private int _idActor_;

	@Column(name="\"strName\"")
	private String _strName_;

	//bi-directional many-to-many association to VideoFile
	@ManyToMany(mappedBy="actors")
	private Set<VideoFile> videoFiles;

    public Actor() {
    }

	public int get_idActor_() {
		return this._idActor_;
	}

	public void set_idActor_(int _idActor_) {
		this._idActor_ = _idActor_;
	}

	public String get_strName_() {
		return this._strName_;
	}

	public void set_strName_(String _strName_) {
		this._strName_ = _strName_;
	}

	public Set<VideoFile> getVideoFiles() {
		return this.videoFiles;
	}

	public void setVideoFiles(Set<VideoFile> videoFiles) {
		this.videoFiles = videoFiles;
	}
	
}