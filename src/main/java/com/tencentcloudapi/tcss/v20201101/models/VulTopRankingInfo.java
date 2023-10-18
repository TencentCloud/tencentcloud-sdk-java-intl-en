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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VulTopRankingInfo extends AbstractModel {

    /**
    * Vulnerability name
    */
    @SerializedName("VulName")
    @Expose
    private String VulName;

    /**
    * Severity. Valid values: `CRITICAL` (critical); `HIGH` (high);`MIDDLE` (medium);`LOW` (low).
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * Number of affected images
    */
    @SerializedName("AffectedImageCount")
    @Expose
    private Long AffectedImageCount;

    /**
    * Number of affected containers
    */
    @SerializedName("AffectedContainerCount")
    @Expose
    private Long AffectedContainerCount;

    /**
    * Vulnerability ID
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * POC ID
    */
    @SerializedName("PocID")
    @Expose
    private String PocID;

    /**
     * Get Vulnerability name 
     * @return VulName Vulnerability name
     */
    public String getVulName() {
        return this.VulName;
    }

    /**
     * Set Vulnerability name
     * @param VulName Vulnerability name
     */
    public void setVulName(String VulName) {
        this.VulName = VulName;
    }

    /**
     * Get Severity. Valid values: `CRITICAL` (critical); `HIGH` (high);`MIDDLE` (medium);`LOW` (low). 
     * @return Level Severity. Valid values: `CRITICAL` (critical); `HIGH` (high);`MIDDLE` (medium);`LOW` (low).
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set Severity. Valid values: `CRITICAL` (critical); `HIGH` (high);`MIDDLE` (medium);`LOW` (low).
     * @param Level Severity. Valid values: `CRITICAL` (critical); `HIGH` (high);`MIDDLE` (medium);`LOW` (low).
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get Number of affected images 
     * @return AffectedImageCount Number of affected images
     */
    public Long getAffectedImageCount() {
        return this.AffectedImageCount;
    }

    /**
     * Set Number of affected images
     * @param AffectedImageCount Number of affected images
     */
    public void setAffectedImageCount(Long AffectedImageCount) {
        this.AffectedImageCount = AffectedImageCount;
    }

    /**
     * Get Number of affected containers 
     * @return AffectedContainerCount Number of affected containers
     */
    public Long getAffectedContainerCount() {
        return this.AffectedContainerCount;
    }

    /**
     * Set Number of affected containers
     * @param AffectedContainerCount Number of affected containers
     */
    public void setAffectedContainerCount(Long AffectedContainerCount) {
        this.AffectedContainerCount = AffectedContainerCount;
    }

    /**
     * Get Vulnerability ID 
     * @return ID Vulnerability ID
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set Vulnerability ID
     * @param ID Vulnerability ID
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get POC ID 
     * @return PocID POC ID
     */
    public String getPocID() {
        return this.PocID;
    }

    /**
     * Set POC ID
     * @param PocID POC ID
     */
    public void setPocID(String PocID) {
        this.PocID = PocID;
    }

    public VulTopRankingInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VulTopRankingInfo(VulTopRankingInfo source) {
        if (source.VulName != null) {
            this.VulName = new String(source.VulName);
        }
        if (source.Level != null) {
            this.Level = new String(source.Level);
        }
        if (source.AffectedImageCount != null) {
            this.AffectedImageCount = new Long(source.AffectedImageCount);
        }
        if (source.AffectedContainerCount != null) {
            this.AffectedContainerCount = new Long(source.AffectedContainerCount);
        }
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.PocID != null) {
            this.PocID = new String(source.PocID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VulName", this.VulName);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "AffectedImageCount", this.AffectedImageCount);
        this.setParamSimple(map, prefix + "AffectedContainerCount", this.AffectedContainerCount);
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "PocID", this.PocID);

    }
}

