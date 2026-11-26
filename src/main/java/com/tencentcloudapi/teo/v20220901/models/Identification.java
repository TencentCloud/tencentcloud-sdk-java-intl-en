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

public class Identification extends AbstractModel {

    /**
    * Site name.
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * Verify a subdomain. This value is empty when verifying a site. A subdomain is verified for a specific subdomain.
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Verification status. Valid values:
<li>pending: verifying.</li>
<li> finished: verification complete.</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Site ownership verification: Dns verification information.
    */
    @SerializedName("Ascription")
    @Expose
    private AscriptionInfo Ascription;

    /**
    * Current NS record of the domain name.
    */
    @SerializedName("OriginalNameServers")
    @Expose
    private String [] OriginalNameServers;

    /**
    * Site ownership verification: file verification information.
    */
    @SerializedName("FileAscription")
    @Expose
    private FileAscriptionInfo FileAscription;

    /**
     * Get Site name. 
     * @return ZoneName Site name.
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set Site name.
     * @param ZoneName Site name.
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    /**
     * Get Verify a subdomain. This value is empty when verifying a site. A subdomain is verified for a specific subdomain. 
     * @return Domain Verify a subdomain. This value is empty when verifying a site. A subdomain is verified for a specific subdomain.
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Verify a subdomain. This value is empty when verifying a site. A subdomain is verified for a specific subdomain.
     * @param Domain Verify a subdomain. This value is empty when verifying a site. A subdomain is verified for a specific subdomain.
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Verification status. Valid values:
<li>pending: verifying.</li>
<li> finished: verification complete.</li> 
     * @return Status Verification status. Valid values:
<li>pending: verifying.</li>
<li> finished: verification complete.</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Verification status. Valid values:
<li>pending: verifying.</li>
<li> finished: verification complete.</li>
     * @param Status Verification status. Valid values:
<li>pending: verifying.</li>
<li> finished: verification complete.</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Site ownership verification: Dns verification information. 
     * @return Ascription Site ownership verification: Dns verification information.
     */
    public AscriptionInfo getAscription() {
        return this.Ascription;
    }

    /**
     * Set Site ownership verification: Dns verification information.
     * @param Ascription Site ownership verification: Dns verification information.
     */
    public void setAscription(AscriptionInfo Ascription) {
        this.Ascription = Ascription;
    }

    /**
     * Get Current NS record of the domain name. 
     * @return OriginalNameServers Current NS record of the domain name.
     */
    public String [] getOriginalNameServers() {
        return this.OriginalNameServers;
    }

    /**
     * Set Current NS record of the domain name.
     * @param OriginalNameServers Current NS record of the domain name.
     */
    public void setOriginalNameServers(String [] OriginalNameServers) {
        this.OriginalNameServers = OriginalNameServers;
    }

    /**
     * Get Site ownership verification: file verification information. 
     * @return FileAscription Site ownership verification: file verification information.
     */
    public FileAscriptionInfo getFileAscription() {
        return this.FileAscription;
    }

    /**
     * Set Site ownership verification: file verification information.
     * @param FileAscription Site ownership verification: file verification information.
     */
    public void setFileAscription(FileAscriptionInfo FileAscription) {
        this.FileAscription = FileAscription;
    }

    public Identification() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Identification(Identification source) {
        if (source.ZoneName != null) {
            this.ZoneName = new String(source.ZoneName);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Ascription != null) {
            this.Ascription = new AscriptionInfo(source.Ascription);
        }
        if (source.OriginalNameServers != null) {
            this.OriginalNameServers = new String[source.OriginalNameServers.length];
            for (int i = 0; i < source.OriginalNameServers.length; i++) {
                this.OriginalNameServers[i] = new String(source.OriginalNameServers[i]);
            }
        }
        if (source.FileAscription != null) {
            this.FileAscription = new FileAscriptionInfo(source.FileAscription);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneName", this.ZoneName);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamObj(map, prefix + "Ascription.", this.Ascription);
        this.setParamArraySimple(map, prefix + "OriginalNameServers.", this.OriginalNameServers);
        this.setParamObj(map, prefix + "FileAscription.", this.FileAscription);

    }
}

