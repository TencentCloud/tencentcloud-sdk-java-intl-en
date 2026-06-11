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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IPAnalyse extends AbstractModel {

    /**
    * 0: safe
1: Suspicious
2 Malicious
3 Unknown
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Tag feature
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * Family information
    */
    @SerializedName("Family")
    @Expose
    private String [] Family;

    /**
    * profile
    */
    @SerializedName("Profile")
    @Expose
    private String [] Profile;

    /**
    * Internet service provider.
    */
    @SerializedName("Isp")
    @Expose
    private String Isp;

    /**
     * Get 0: safe
1: Suspicious
2 Malicious
3 Unknown 
     * @return Status 0: safe
1: Suspicious
2 Malicious
3 Unknown
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 0: safe
1: Suspicious
2 Malicious
3 Unknown
     * @param Status 0: safe
1: Suspicious
2 Malicious
3 Unknown
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Tag feature 
     * @return Tags Tag feature
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag feature
     * @param Tags Tag feature
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Family information 
     * @return Family Family information
     */
    public String [] getFamily() {
        return this.Family;
    }

    /**
     * Set Family information
     * @param Family Family information
     */
    public void setFamily(String [] Family) {
        this.Family = Family;
    }

    /**
     * Get profile 
     * @return Profile profile
     */
    public String [] getProfile() {
        return this.Profile;
    }

    /**
     * Set profile
     * @param Profile profile
     */
    public void setProfile(String [] Profile) {
        this.Profile = Profile;
    }

    /**
     * Get Internet service provider. 
     * @return Isp Internet service provider.
     */
    public String getIsp() {
        return this.Isp;
    }

    /**
     * Set Internet service provider.
     * @param Isp Internet service provider.
     */
    public void setIsp(String Isp) {
        this.Isp = Isp;
    }

    public IPAnalyse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IPAnalyse(IPAnalyse source) {
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Tags != null) {
            this.Tags = new String[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new String(source.Tags[i]);
            }
        }
        if (source.Family != null) {
            this.Family = new String[source.Family.length];
            for (int i = 0; i < source.Family.length; i++) {
                this.Family[i] = new String(source.Family[i]);
            }
        }
        if (source.Profile != null) {
            this.Profile = new String[source.Profile.length];
            for (int i = 0; i < source.Profile.length; i++) {
                this.Profile[i] = new String(source.Profile[i]);
            }
        }
        if (source.Isp != null) {
            this.Isp = new String(source.Isp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);
        this.setParamArraySimple(map, prefix + "Family.", this.Family);
        this.setParamArraySimple(map, prefix + "Profile.", this.Profile);
        this.setParamSimple(map, prefix + "Isp", this.Isp);

    }
}

