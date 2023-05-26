/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Identification extends AbstractModel{

    /**
    * The site name.
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * The subdomain name to be verified. To verify the ownership of a site, leave it blank.
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * The verification status. Values:
<li>`pending`: The verification is ongoing.</li>
<li>`finished`: The verification completed.</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Details of the DNS record.
    */
    @SerializedName("Ascription")
    @Expose
    private AscriptionInfo Ascription;

    /**
    * The NS record of the domain name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OriginalNameServers")
    @Expose
    private String [] OriginalNameServers;

    /**
    * Details of the verification file.
    */
    @SerializedName("FileAscription")
    @Expose
    private FileAscriptionInfo FileAscription;

    /**
     * Get The site name. 
     * @return ZoneName The site name.
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set The site name.
     * @param ZoneName The site name.
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    /**
     * Get The subdomain name to be verified. To verify the ownership of a site, leave it blank.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return Domain The subdomain name to be verified. To verify the ownership of a site, leave it blank.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set The subdomain name to be verified. To verify the ownership of a site, leave it blank.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param Domain The subdomain name to be verified. To verify the ownership of a site, leave it blank.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get The verification status. Values:
<li>`pending`: The verification is ongoing.</li>
<li>`finished`: The verification completed.</li> 
     * @return Status The verification status. Values:
<li>`pending`: The verification is ongoing.</li>
<li>`finished`: The verification completed.</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set The verification status. Values:
<li>`pending`: The verification is ongoing.</li>
<li>`finished`: The verification completed.</li>
     * @param Status The verification status. Values:
<li>`pending`: The verification is ongoing.</li>
<li>`finished`: The verification completed.</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Details of the DNS record. 
     * @return Ascription Details of the DNS record.
     */
    public AscriptionInfo getAscription() {
        return this.Ascription;
    }

    /**
     * Set Details of the DNS record.
     * @param Ascription Details of the DNS record.
     */
    public void setAscription(AscriptionInfo Ascription) {
        this.Ascription = Ascription;
    }

    /**
     * Get The NS record of the domain name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return OriginalNameServers The NS record of the domain name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getOriginalNameServers() {
        return this.OriginalNameServers;
    }

    /**
     * Set The NS record of the domain name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param OriginalNameServers The NS record of the domain name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOriginalNameServers(String [] OriginalNameServers) {
        this.OriginalNameServers = OriginalNameServers;
    }

    /**
     * Get Details of the verification file. 
     * @return FileAscription Details of the verification file.
     */
    public FileAscriptionInfo getFileAscription() {
        return this.FileAscription;
    }

    /**
     * Set Details of the verification file.
     * @param FileAscription Details of the verification file.
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

