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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VulHostTopInfo extends AbstractModel {

    /**
    * Host name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * Vulnerability level and quantity statistics list
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VulLevelList")
    @Expose
    private VulLevelCountInfo [] VulLevelList;

    /**
    * Host QUUID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * Top ratings
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Score")
    @Expose
    private Long Score;

    /**
     * Get Host name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HostName Host name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getHostName() {
        return this.HostName;
    }

    /**
     * Set Host name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param HostName Host name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHostName(String HostName) {
        this.HostName = HostName;
    }

    /**
     * Get Vulnerability level and quantity statistics list
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VulLevelList Vulnerability level and quantity statistics list
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public VulLevelCountInfo [] getVulLevelList() {
        return this.VulLevelList;
    }

    /**
     * Set Vulnerability level and quantity statistics list
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VulLevelList Vulnerability level and quantity statistics list
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVulLevelList(VulLevelCountInfo [] VulLevelList) {
        this.VulLevelList = VulLevelList;
    }

    /**
     * Get Host QUUID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Quuid Host QUUID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set Host QUUID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Quuid Host QUUID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get Top ratings
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Score Top ratings
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getScore() {
        return this.Score;
    }

    /**
     * Set Top ratings
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Score Top ratings
Note: This field may return null, indicating that no valid values can be obtained.
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

