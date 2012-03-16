package org.atgas.sync.boxee;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the SEASONS database table.
 * 
 */
@Entity
@Table(name="SEASONS")
public class Season implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="\"idSeason\"")
	private int _idSeason_;

	@Column(name="\"iSeasonNum\"")
	private int _iSeasonNum_;

	@Column(name="\"iVirtual\"")
	private int _iVirtual_;

	@Column(name="\"iYear\"")
	private int _iYear_;

	@Column(name="\"strCover\"")
	private String _strCover_;

	@Column(name="\"strDescription\"")
	private String _strDescription_;

	@Column(name="\"strLanguage\"")
	private String _strLanguage_;

	@Column(name="\"strPath\"")
	private String _strPath_;

	//bi-directional many-to-one association to Series
    @ManyToOne
	@JoinColumn(name="\"idSeries\"")
	private Series series;

    public Season() {
    }

	public int get_idSeason_() {
		return this._idSeason_;
	}

	public void set_idSeason_(int _idSeason_) {
		this._idSeason_ = _idSeason_;
	}

	public int get_iSeasonNum_() {
		return this._iSeasonNum_;
	}

	public void set_iSeasonNum_(int _iSeasonNum_) {
		this._iSeasonNum_ = _iSeasonNum_;
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

	public Series getSery() {
		return this.series;
	}

	public void setSery(Series sery) {
		this.series = sery;
	}
	
}