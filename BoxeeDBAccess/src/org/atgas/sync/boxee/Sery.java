package org.atgas.sync.boxee;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the SERIES database table.
 * 
 */
@Entity
@Table(name="SERIES")
public class Sery implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="\"idSeries\"")
	private int _idSeries_;

	@Column(name="\"iVirtual\"")
	private int _iVirtual_;

	@Column(name="\"iYear\"")
	private int _iYear_;

	@Column(name="\"strBoxeeId\"")
	private String _strBoxeeId_;

	@Column(name="\"strCover\"")
	private String _strCover_;

	@Column(name="\"strDescription\"")
	private String _strDescription_;

	@Column(name="\"strGenre\"")
	private String _strGenre_;

	@Column(name="\"strLanguage\"")
	private String _strLanguage_;

	@Column(name="\"strPath\"")
	private String _strPath_;

	@Column(name="\"strTitle\"")
	private String _strTitle_;

	//bi-directional many-to-one association to Season
	@OneToMany(mappedBy="sery")
	private Set<Season> seasons;

	//bi-directional many-to-one association to VideoFile
	@OneToMany(mappedBy="sery")
	private Set<VideoFile> videoFiles;

    public Sery() {
    }

	public int get_idSeries_() {
		return this._idSeries_;
	}

	public void set_idSeries_(int _idSeries_) {
		this._idSeries_ = _idSeries_;
	}

	public int get_iVirtual_() {
		return this._iVirtual_;
	}

	public void set_iVirtual_(int _iVirtual_) {
		this._iVirtual_ = _iVirtual_;
	}

	public int get_iYear_() {
		return this._iYear_;
	}

	public void set_iYear_(int _iYear_) {
		this._iYear_ = _iYear_;
	}

	public String get_strBoxeeId_() {
		return this._strBoxeeId_;
	}

	public void set_strBoxeeId_(String _strBoxeeId_) {
		this._strBoxeeId_ = _strBoxeeId_;
	}

	public String get_strCover_() {
		return this._strCover_;
	}

	public void set_strCover_(String _strCover_) {
		this._strCover_ = _strCover_;
	}

	public String get_strDescription_() {
		return this._strDescription_;
	}

	public void set_strDescription_(String _strDescription_) {
		this._strDescription_ = _strDescription_;
	}

	public String get_strGenre_() {
		return this._strGenre_;
	}

	public void set_strGenre_(String _strGenre_) {
		this._strGenre_ = _strGenre_;
	}

	public String get_strLanguage_() {
		return this._strLanguage_;
	}

	public void set_strLanguage_(String _strLanguage_) {
		this._strLanguage_ = _strLanguage_;
	}

	public String get_strPath_() {
		return this._strPath_;
	}

	public void set_strPath_(String _strPath_) {
		this._strPath_ = _strPath_;
	}

	public String get_strTitle_() {
		return this._strTitle_;
	}

	public void set_strTitle_(String _strTitle_) {
		this._strTitle_ = _strTitle_;
	}

	public Set<Season> getSeasons() {
		return this.seasons;
	}

	public void setSeasons(Set<Season> seasons) {
		this.seasons = seasons;
	}
	
	public Set<VideoFile> getVideoFiles() {
		return this.videoFiles;
	}

	public void setVideoFiles(Set<VideoFile> videoFiles) {
		this.videoFiles = videoFiles;
	}
	
}