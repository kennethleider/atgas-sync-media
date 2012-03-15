package org.atgas.sync.boxee;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the WATCHED database table.
 * 
 */
@Entity
public class Watched implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"fPositionInSeconds\"")
	private double _fPositionInSeconds_;

	@Id
	@Column(name="\"idWatched\"")
	private int _idWatched_;

	@Column(name="\"iLastPlayed\"")
	private int _iLastPlayed_;

	@Column(name="\"iPlayCount\"")
	private int _iPlayCount_;

	@Column(name="\"strPath\"")
	private String _strPath_;

	//bi-directional one-to-one association to VideoFile
	@OneToOne()
	@JoinColumn(name="\"strBoxeeId\"")
	private VideoFile videoFile;

    public Watched() {
    }

	public double get_fPositionInSeconds_() {
		return this._fPositionInSeconds_;
	}

	public void set_fPositionInSeconds_(double _fPositionInSeconds_) {
		this._fPositionInSeconds_ = _fPositionInSeconds_;
	}

	public int get_idWatched_() {
		return this._idWatched_;
	}

	public void set_idWatched_(int _idWatched_) {
		this._idWatched_ = _idWatched_;
	}

	public int get_iLastPlayed_() {
		return this._iLastPlayed_;
	}

	public void set_iLastPlayed_(int _iLastPlayed_) {
		this._iLastPlayed_ = _iLastPlayed_;
	}

	public int get_iPlayCount_() {
		return this._iPlayCount_;
	}

	public void set_iPlayCount_(int _iPlayCount_) {
		this._iPlayCount_ = _iPlayCount_;
	}

	public String get_strPath_() {
		return this._strPath_;
	}

	public void set_strPath_(String _strPath_) {
		this._strPath_ = _strPath_;
	}

	public VideoFile getVideoFile() {
		return this.videoFile;
	}

	public void setVideoFile(VideoFile videoFile) {
		this.videoFile = videoFile;
	}
	
}