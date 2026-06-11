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

public class VulHostTopInfo extends AbstractModel {

    /**
    * host name
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * Vulnerability level and quantity statistics list
    */
    @SerializedName("VulLevelList")
    @Expose
    private VulLevelCountInfo [] VulLevelList;

    /**
    * Host QUUID
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * top rating
    */
    @SerializedName("Score")
    @Expose
    private Long Score;

    /**
     * Get host name 
     * @return HostName host name
     */
    public String getHostName() {
        return this.HostName;
    }

    /**
     * Set host name
     * @param HostName host name
     */
    public void setHostName(String HostName) {
        this.HostName = HostName;
    }

    /**
     * Get Vulnerability level and quantity statistics list 
     * @return VulLevelList Vulnerability level and quantity statistics list
     */
    public VulLevelCountInfo [] getVulLevelList() {
        return this.VulLevelList;
    }

    /**
     * Set Vulnerability level and quantity statistics list
     * @param VulLevelList Vulnerability level and quantity statistics list
     */
    public void setVulLevelList(VulLevelCountInfo [] VulLevelList) {
        this.VulLevelList = VulLevelList;
    }

    /**
     * Get Host QUUID 
     * @return Quuid Host QUUID
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set Host QUUID
     * @param Quuid Host QUUID
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get top rating 
     * @return Score top rating
     */
    public Long getScore() {
        return this.Score;
    }

    /**
     * Set top rating
     * @param Score top rating
     */
    public void setScore(Long Score) {
        this.Score = Score;
    }

    public VulHostTopInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VulHostTopInfo(VulHostTopInfo source) {
        if (source.HostName != null) {
            this.HostName = new String(source.HostName);
        }
        if (source.VulLevelList != null) {
            this.VulLevelList = new VulLevelCountInfo[source.VulLevelList.length];
            for (int i = 0; i < source.VulLevelList.length; i++) {
                this.VulLevelList[i] = new VulLevelCountInfo(source.VulLevelList[i]);
            }
        }
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.Score != null) {
            this.Score = new Long(source.Score);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HostName", this.HostName);
        this.setParamArrayObj(map, prefix + "VulLevelList.", this.VulLevelList);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "Score", this.Score);

    }
}

