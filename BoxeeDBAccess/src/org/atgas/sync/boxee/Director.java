package org.atgas.sync.boxee;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


/**
 * The persistent class for the DIRECTORS database table.
 * 
 */
@Entity
@Table(name="DIRECTORS")
public class Director implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="\"idDirector\"")
	private int _idDirector_;

	@Column(name="\"strName\"")
	private String _strName_;

	//bi-directional many-to-many association to VideoFile
	@ManyToMany(mappedBy="directors")
	private Set<VideoFile> videoFiles;

    public Director() {
    }

	public int get_idDirector_() {
		return this._idDirector_;
	}

	public void set_idDirector_(int _idDirector_) {
		this._idDirector_ = _idDirector_;
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