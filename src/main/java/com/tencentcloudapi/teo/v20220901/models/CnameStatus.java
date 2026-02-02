/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CnameStatus extends AbstractModel {

    /**
    * Domain name.
    */
    @SerializedName("RecordName")
    @Expose
    private String RecordName;

    /**
    * EdgeOne is assigned to the CNAME of the domain name.
    */
    @SerializedName("Cname")
    @Expose
    private String Cname;

    /**
    * CNAME configuration status verification result. valid values:.
<li>active: indicates that the domain name is correctly configured to the designated CNAME assigned by EdgeOne.</li>.
<li>moved: indicates the domain name is not configured to the designated CNAME assigned by EdgeOne;</li>.
<li>invalid: indicates the CNAME in the access domain configuration is assigned by EdgeOne to another domain, which can cause service exception. change it to the CNAME provided by EdgeOne for this domain. you can get the CNAME provided by EdgeOne for this domain from the CNAME field in this struct.</li>.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get Domain name. 
     * @return RecordName Domain name.
     */
    public String getRecordName() {
        return this.RecordName;
    }

    /**
     * Set Domain name.
     * @param RecordName Domain name.
     */
    public void setRecordName(String RecordName) {
        this.RecordName = RecordName;
    }

    /**
     * Get EdgeOne is assigned to the CNAME of the domain name. 
     * @return Cname EdgeOne is assigned to the CNAME of the domain name.
     */
    public String getCname() {
        return this.Cname;
    }

    /**
     * Set EdgeOne is assigned to the CNAME of the domain name.
     * @param Cname EdgeOne is assigned to the CNAME of the domain name.
     */
    public void setCname(String Cname) {
        this.Cname = Cname;
    }

    /**
     * Get CNAME configuration status verification result. valid values:.
<li>active: indicates that the domain name is correctly configured to the designated CNAME assigned by EdgeOne.</li>.
<li>moved: indicates the domain name is not configured to the designated CNAME assigned by EdgeOne;</li>.
<li>invalid: indicates the CNAME in the access domain configuration is assigned by EdgeOne to another domain, which can cause service exception. change it to the CNAME provided by EdgeOne for this domain. you can get the CNAME provided by EdgeOne for this domain from the CNAME field in this struct.</li>. 
     * @return Status CNAME configuration status verification result. valid values:.
<li>active: indicates that the domain name is correctly configured to the designated CNAME assigned by EdgeOne.</li>.
<li>moved: indicates the domain name is not configured to the designated CNAME assigned by EdgeOne;</li>.
<li>invalid: indicates the CNAME in the access domain configuration is assigned by EdgeOne to another domain, which can cause service exception. change it to the CNAME provided by EdgeOne for this domain. you can get the CNAME provided by EdgeOne for this domain from the CNAME field in this struct.</li>.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set CNAME configuration status verification result. valid values:.
<li>active: indicates that the domain name is correctly configured to the designated CNAME assigned by EdgeOne.</li>.
<li>moved: indicates the domain name is not configured to the designated CNAME assigned by EdgeOne;</li>.
<li>invalid: indicates the CNAME in the access domain configuration is assigned by EdgeOne to another domain, which can cause service exception. change it to the CNAME provided by EdgeOne for this domain. you can get the CNAME provided by EdgeOne for this domain from the CNAME field in this struct.</li>.
     * @param Status CNAME configuration status verification result. valid values:.
<li>active: indicates that the domain name is correctly configured to the designated CNAME assigned by EdgeOne.</li>.
<li>moved: indicates the domain name is not configured to the designated CNAME assigned by EdgeOne;</li>.
<li>invalid: indicates the CNAME in the access domain configuration is assigned by EdgeOne to another domain, which can cause service exception. change it to the CNAME provided by EdgeOne for this domain. you can get the CNAME provided by EdgeOne for this domain from the CNAME field in this struct.</li>.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public CnameStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CnameStatus(CnameStatus source) {
        if (source.RecordName != null) {
            this.RecordName = new String(source.RecordName);
        }
        if (source.Cname != null) {
            this.Cname = new String(source.Cname);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RecordName", this.RecordName);
        this.setParamSimple(map, prefix + "Cname", this.Cname);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

