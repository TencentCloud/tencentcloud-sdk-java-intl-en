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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AIAgentCredential extends AbstractModel {

    /**
    * <p>Credential ID</p>
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * <p>Credential name</p>
    */
    @SerializedName("CredName")
    @Expose
    private String CredName;

    /**
    * <p>Credential type</p><p>Enumeration values:</p><ul><li>OAUTH: OAUTH credential</li><li>API_TOKEN: TOKEN credential</li><li>CLOUD_AK: AK/SK credential</li></ul>
    */
    @SerializedName("CredType")
    @Expose
    private String CredType;

    /**
    * <p>Credential location identification</p>
    */
    @SerializedName("Locations")
    @Expose
    private AIAgentCredentialLocation [] Locations;

    /**
    * <p>Latest scan discovery time</p>
    */
    @SerializedName("DetectTime")
    @Expose
    private String DetectTime;

    /**
    * <p>Total count of leakage locations of this credential</p>
    */
    @SerializedName("HitCount")
    @Expose
    private Long HitCount;

    /**
     * Get <p>Credential ID</p> 
     * @return ID <p>Credential ID</p>
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set <p>Credential ID</p>
     * @param ID <p>Credential ID</p>
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get <p>Credential name</p> 
     * @return CredName <p>Credential name</p>
     */
    public String getCredName() {
        return this.CredName;
    }

    /**
     * Set <p>Credential name</p>
     * @param CredName <p>Credential name</p>
     */
    public void setCredName(String CredName) {
        this.CredName = CredName;
    }

    /**
     * Get <p>Credential type</p><p>Enumeration values:</p><ul><li>OAUTH: OAUTH credential</li><li>API_TOKEN: TOKEN credential</li><li>CLOUD_AK: AK/SK credential</li></ul> 
     * @return CredType <p>Credential type</p><p>Enumeration values:</p><ul><li>OAUTH: OAUTH credential</li><li>API_TOKEN: TOKEN credential</li><li>CLOUD_AK: AK/SK credential</li></ul>
     */
    public String getCredType() {
        return this.CredType;
    }

    /**
     * Set <p>Credential type</p><p>Enumeration values:</p><ul><li>OAUTH: OAUTH credential</li><li>API_TOKEN: TOKEN credential</li><li>CLOUD_AK: AK/SK credential</li></ul>
     * @param CredType <p>Credential type</p><p>Enumeration values:</p><ul><li>OAUTH: OAUTH credential</li><li>API_TOKEN: TOKEN credential</li><li>CLOUD_AK: AK/SK credential</li></ul>
     */
    public void setCredType(String CredType) {
        this.CredType = CredType;
    }

    /**
     * Get <p>Credential location identification</p> 
     * @return Locations <p>Credential location identification</p>
     */
    public AIAgentCredentialLocation [] getLocations() {
        return this.Locations;
    }

    /**
     * Set <p>Credential location identification</p>
     * @param Locations <p>Credential location identification</p>
     */
    public void setLocations(AIAgentCredentialLocation [] Locations) {
        this.Locations = Locations;
    }

    /**
     * Get <p>Latest scan discovery time</p> 
     * @return DetectTime <p>Latest scan discovery time</p>
     */
    public String getDetectTime() {
        return this.DetectTime;
    }

    /**
     * Set <p>Latest scan discovery time</p>
     * @param DetectTime <p>Latest scan discovery time</p>
     */
    public void setDetectTime(String DetectTime) {
        this.DetectTime = DetectTime;
    }

    /**
     * Get <p>Total count of leakage locations of this credential</p> 
     * @return HitCount <p>Total count of leakage locations of this credential</p>
     */
    public Long getHitCount() {
        return this.HitCount;
    }

    /**
     * Set <p>Total count of leakage locations of this credential</p>
     * @param HitCount <p>Total count of leakage locations of this credential</p>
     */
    public void setHitCount(Long HitCount) {
        this.HitCount = HitCount;
    }

    public AIAgentCredential() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AIAgentCredential(AIAgentCredential source) {
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.CredName != null) {
            this.CredName = new String(source.CredName);
        }
        if (source.CredType != null) {
            this.CredType = new String(source.CredType);
        }
        if (source.Locations != null) {
            this.Locations = new AIAgentCredentialLocation[source.Locations.length];
            for (int i = 0; i < source.Locations.length; i++) {
                this.Locations[i] = new AIAgentCredentialLocation(source.Locations[i]);
            }
        }
        if (source.DetectTime != null) {
            this.DetectTime = new String(source.DetectTime);
        }
        if (source.HitCount != null) {
            this.HitCount = new Long(source.HitCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "CredName", this.CredName);
        this.setParamSimple(map, prefix + "CredType", this.CredType);
        this.setParamArrayObj(map, prefix + "Locations.", this.Locations);
        this.setParamSimple(map, prefix + "DetectTime", this.DetectTime);
        this.setParamSimple(map, prefix + "HitCount", this.HitCount);

    }
}

