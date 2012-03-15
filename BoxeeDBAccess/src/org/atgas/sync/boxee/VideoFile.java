package org.atgas.sync.boxee;

import java.io.Serializable;
import java.util.Set;

import javax.annotation.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

import org.eclipse.persistence.annotations.CascadeOnDelete;


/**
 * The persistent class for the VIDEO_FILES database table.
 * 
 */
@Entity
@Table(name="VIDEO_FILES")
public class VideoFile implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id()
	@GeneratedValue(generator="vidGen")
	@TableGenerator(name = "vidGen", table = "sqlite_sequence", pkColumnName = "name", valueColumnName = "seq", pkColumnValue = "video_files", allocationSize = 1)
	@Column(name="\"idVideo\"")
	private int idVideo;
	
	@Column(name="\"iDateAdded\"")
	private int dateAdded;

	@Column(name="\"iDateModified\"")
	private int dateModified;

	
	@Column(name="\"idFile\"")
	private int idFile;

	@Column(name="\"idFolder\"")
	private int idFolder;

	@Column(name="\"iDropped\"")
	private int iDropped;

	@Column(name="\"iDuration\"")
	private long iDuration;



	@Column(name="\"iEpisode\"")
	private int iEpisode;

	@Column(name="\"iHasMetadata\"")
	private int iHasMetadata;

	@Column(name="\"iPopularity\"")
	private int iPopularity;

	@Column(name="\"iRating\"")
	private int iRating;

	@Column(name="\"iReleaseDate\"")
	private int iReleaseDate;

	@Column(name="\"iSeason\"")
	private int iSeason;

	@Column(name="\"iYear\"")
	private int iYear;

	@Column(name="\"strBoxeeId\"")
	private String strBoxeeId;

	@Column(name="\"strCover\"")
	private String strCover;

	@Column(name="\"strCredits\"")
	private String strCredits;

	@Column(name="\"strDescription\"")
	private String strDescription;

	@Column(name="\"strExtDescription\"")
	private String strExtDescription;

	@Column(name="\"strGenre\"")
	private String strGenre;

	@Column(name="\"strIMDBKey\"")
	private String strIMDBKey;

	@Column(name="\"strLanguage\"")
	private String strLanguage;

	@Column(name="\"strMPAARating\"")
	private String strMPAARating;

	@Column(name="\"strPath\"")
	private String path;

	@Column(name="\"strShowTitle\"")
	private String strShowTitle;

	@Column(name="\"strStudio\"")
	private String strStudio;

	@Column(name="\"strTagLine\"")
	private String strTagLine;

	@Column(name="\"strTitle\"")
	private String strTitle;

	@Column(name="\"strTrailerUrl\"")
	private String strTrailerUrl;

	@Column(name="\"strType\"")
	private String strType;

	//bi-directional many-to-many association to Actor
    @ManyToMany
	@JoinTable(name="ACTOR_TO_VIDEO"
		, joinColumns={@JoinColumn(name="\"idActor\"")}
		, inverseJoinColumns={@JoinColumn(name="\"idVideo\"")}
		)
	private Set<Actor> actors;

	//bi-directional many-to-many association to Director
    @ManyToMany
	@JoinTable(
		name="DIRECTOR_TO_VIDEO"
			, joinColumns={@JoinColumn(name="\"idDirector\"")}
		, inverseJoinColumns={@JoinColumn(name="\"idVideo\"")}
		)
	private Set<Director> directors;

	//bi-directional many-to-one association to Series
    @ManyToOne(cascade={CascadeType.PERSIST})
	@JoinColumn(name="\"strSeriesId\"", referencedColumnName="\"strBoxeeId\"")

	private Series series;

    public VideoFile() {
    }

	public int getiDateAdded() {
		return this.dateAdded;
	}

	public void setiDateAdded(int iDateAdded) {
		this.dateAdded = iDateAdded;
	}

	public int getiDateModified() {
		return this.dateModified;
	}

	public void setiDateModified(int iDateModified) {
		this.dateModified = iDateModified;
	}

	public int getIDFile() {
		return this.idFile;
	}

	public void setIDFile(int id) {
		this.idFile = id;
	}

	public int getidFolder() {
		return this.idFolder;
	}

	public void setidFolder(int idFolder) {
		this.idFolder = idFolder;
	}

	public int getiDropped() {
		return this.iDropped;
	}

	public void setiDropped(int iDropped) {
		this.iDropped = iDropped;
	}

	public long getiDuration() {
		return this.iDuration;
	}

	public void setiDuration(long l) {
		this.iDuration = l;
	}

	public int getID() {
		return this.idVideo;
	}

	public void setID(int idVideo) {
		this.idVideo = idVideo;
	}

	public int getiEpisode() {
		return this.iEpisode;
	}

	public void setiEpisode(int iEpisode) {
		this.iEpisode = iEpisode;
	}

	public int getiHasMetadata() {
		return this.iHasMetadata;
	}

	public void setiHasMetadata(int iHasMetadata) {
		this.iHasMetadata = iHasMetadata;
	}

	public int getiPopularity() {
		return this.iPopularity;
	}

	public void setiPopularity(int iPopularity) {
		this.iPopularity = iPopularity;
	}

	public int getiRating() {
		return this.iRating;
	}

	public void setiRating(int iRating) {
		this.iRating = iRating;
	}

	public int getiReleaseDate() {
		return this.iReleaseDate;
	}

	public void setiReleaseDate(int iReleaseDate) {
		this.iReleaseDate = iReleaseDate;
	}

	public int getiSeason() {
		return this.iSeason;
	}

	public void setiSeason(int iSeason) {
		this.iSeason = iSeason;
	}

	public int getiYear() {
		return this.iYear;
	}

	public void setiYear(int iYear) {
		this.iYear = iYear;
	}

	public String getstrBoxeeId() {
		return this.strBoxeeId;
	}

	public void setstrBoxeeId(String strBoxeeId) {
		this.strBoxeeId = strBoxeeId;
	}

	public String getstrCover() {
		return this.strCover;
	}

	public void setstrCover(String strCover) {
		this.strCover = strCover;
	}

	public String getstrCredits() {
		return this.strCredits;
	}

	public void setstrCredits(String strCredits) {
		this.strCredits = strCredits;
	}

	public String getstrDescription() {
		return this.strDescription;
	}

	public void setstrDescription(String strDescription) {
		this.strDescription = strDescription;
	}

	public String getstrExtDescription() {
		return this.strExtDescription;
	}

	public void setstrExtDescription(String strExtDescription) {
		this.strExtDescription = strExtDescription;
	}

	public String getstrGenre() {
		return this.strGenre;
	}

	public void setstrGenre(String strGenre) {
		this.strGenre = strGenre;
	}

	public String getstrIMDBKey() {
		return this.strIMDBKey;
	}

	public void setstrIMDBKey(String strIMDBKey) {
		this.strIMDBKey = strIMDBKey;
	}

	public String getstrLanguage() {
		return this.strLanguage;
	}

	public void setstrLanguage(String strLanguage) {
		this.strLanguage = strLanguage;
	}

	public String getstrMPAARating() {
		return this.strMPAARating;
	}

	public void setstrMPAARating(String strMPAARating) {
		this.strMPAARating = strMPAARating;
	}

	public String getPath() {
		return this.path;
	}

	public void setstrPath(String strPath) {
		this.path = strPath;
	}

	public String getstrShowTitle() {
		return this.strShowTitle;
	}

	public void setstrShowTitle(String strShowTitle) {
		this.strShowTitle = strShowTitle;
	}

	public String getstrStudio() {
		return this.strStudio;
	}

	public void setstrStudio(String strStudio) {
		this.strStudio = strStudio;
	}

	public String getstrTagLine() {
		return this.strTagLine;
	}

	public void setstrTagLine(String strTagLine) {
		this.strTagLine = strTagLine;
	}

	public String getstrTitle() {
		return this.strTitle;
	}

	public void setstrTitle(String strTitle) {
		this.strTitle = strTitle;
	}

	public String getstrTrailerUrl() {
		return this.strTrailerUrl;
	}

	public void setstrTrailerUrl(String strTrailerUrl) {
		this.strTrailerUrl = strTrailerUrl;
	}

	public String getstrType() {
		return this.strType;
	}

	public void setstrType(String strType) {
		this.strType = strType;
	}

	public Set<Actor> getActors() {
		return this.actors;
	}

	public void setActors(Set<Actor> actors) {
		this.actors = actors;
	}
	
	public Set<Director> getDirectors() {
		return this.directors;
	}

	public void setDirectors(Set<Director> directors) {
		this.directors = directors;
	}
	
	public Series getSeries() {
		return this.series;
	}

	public void setSeries(Series sery) {
		this.series = sery;
	}	
}