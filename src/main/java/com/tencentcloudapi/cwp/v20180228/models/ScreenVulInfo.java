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

public class ScreenVulInfo extends AbstractModel {

    /**
    * Vulnerability Event ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Vulnerability name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Vulnerability ID
    */
    @SerializedName("VulId")
    @Expose
    private Long VulId;

    /**
    * Last detection Time
    */
    @SerializedName("LastTime")
    @Expose
    private String LastTime;

    /**
    * Vulnerability level 1: low-risk; 2: medium-risk; 3: high-risk; 4: prompt
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * Vulnerability type: 1 - web-cms vulnerabilities; 2 - application vulnerabilities; 4 - Linux software vulnerabilities; 5 - Windows system vulnerabilities
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Category")
    @Expose
    private Long Category;

    /**
    * Host UUID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
     * Get Vulnerability Event ID 
     * @return Id Vulnerability Event ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Vulnerability Event ID
     * @param Id Vulnerability Event ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get Vulnerability name 
     * @return Name Vulnerability name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Vulnerability name
     * @param Name Vulnerability name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Vulnerability ID 
     * @return VulId Vulnerability ID
     */
    public Long getVulId() {
        return this.VulId;
    }

    /**
     * Set Vulnerability ID
     * @param VulId Vulnerability ID
     */
    public void setVulId(Long VulId) {
        this.VulId = VulId;
    }

    /**
     * Get Last detection Time 
     * @return LastTime Last detection Time
     */
    public String getLastTime() {
        return this.LastTime;
    }

    /**
     * Set Last detection Time
     * @param LastTime Last detection Time
     */
    public void setLastTime(String LastTime) {
        this.LastTime = LastTime;
    }

    /**
     * Get Vulnerability level 1: low-risk; 2: medium-risk; 3: high-risk; 4: prompt 
     * @return Level Vulnerability level 1: low-risk; 2: medium-risk; 3: high-risk; 4: prompt
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set Vulnerability level 1: low-risk; 2: medium-risk; 3: high-risk; 4: prompt
     * @param Level Vulnerability level 1: low-risk; 2: medium-risk; 3: high-risk; 4: prompt
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get Vulnerability type: 1 - web-cms vulnerabilities; 2 - application vulnerabilities; 4 - Linux software vulnerabilities; 5 - Windows system vulnerabilities
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Category Vulnerability type: 1 - web-cms vulnerabilities; 2 - application vulnerabilities; 4 - Linux software vulnerabilities; 5 - Windows system vulnerabilities
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getCategory() {
        return this.Category;
    }

    /**
     * Set Vulnerability type: 1 - web-cms vulnerabilities; 2 - application vulnerabilities; 4 - Linux software vulnerabilities; 5 - Windows system vulnerabilities
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Category Vulnerability type: 1 - web-cms vulnerabilities; 2 - application vulnerabilities; 4 - Linux software vulnerabilities; 5 - Windows system vulnerabilities
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCategory(Long Category) {
        this.Category = Category;
    }

    /**
     * Get Host UUID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Uuid Host UUID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set Host UUID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Uuid Host UUID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    public ScreenVulInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScreenVulInfo(ScreenVulInfo source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.VulId != null) {
            this.VulId = new Long(source.VulId);
        }
        if (source.LastTime != null) {
            this.LastTime = new String(source.LastTime);
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.Category != null) {
            this.Category = new Long(source.Category);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "VulId", this.VulId);
        this.setParamSimple(map, prefix + "LastTime", this.LastTime);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "Category", this.Category);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);

    }
}

