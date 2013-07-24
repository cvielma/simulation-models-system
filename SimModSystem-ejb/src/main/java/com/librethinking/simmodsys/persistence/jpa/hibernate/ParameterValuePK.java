/*
 * Copyright 2012 Christian Vielma <cvielma@librethinking.com>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.librethinking.simmodsys.persistence.jpa.hibernate;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Christian Vielma <cvielma@librethinking.com>
 */
@Embeddable
public class ParameterValuePK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "\"C_PARAM\"")
    private int cParam;
    @Basic(optional = false)
    @NotNull
    @Column(name = "\"C_PARAM_VALUE\"")
    private int cParamValue;

    public ParameterValuePK() {
    }

    public ParameterValuePK(int cParam, int cParamValue) {
        this.cParam = cParam;
        this.cParamValue = cParamValue;
    }

    public int getCParam() {
        return cParam;
    }

    public void setCParam(int cParam) {
        this.cParam = cParam;
    }

    public int getCParamValue() {
        return cParamValue;
    }

    public void setCParamValue(int cParamValue) {
        this.cParamValue = cParamValue;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) cParam;
        hash += (int) cParamValue;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ParameterValuePK)) {
            return false;
        }
        ParameterValuePK other = (ParameterValuePK) object;
        if (this.cParam != other.cParam) {
            return false;
        }
        if (this.cParamValue != other.cParamValue) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.librethinking.simmodsys.persistence.jpa.hibernate.ParameterValuePK[ cParam=" + cParam + ", cParamValue=" + cParamValue + " ]";
    }
    
}
