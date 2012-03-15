package org.atgas.sync.boxee;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the PROPERTIES database table.
 * 
 */
@Entity
@Table(name="PROPERTIES")
public class Property implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="\"strName\"")
	private String _strName_;

	@Column(name="\"strValue\"")
	private String _strValue_;

    public Property() {
    }

	public String get_strName_() {
		return this._strName_;
	}

	public void set_strName_(String _strName_) {
		this._strName_ = _strName_;
	}

	public String get_strValue_() {
		return this._strValue_;
	}

	public void set_strValue_(String _strValue_) {
		this._strValue_ = _strValue_;
	}

}