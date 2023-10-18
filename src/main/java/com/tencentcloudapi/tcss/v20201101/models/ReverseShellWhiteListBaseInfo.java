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

public class ReverseShellWhiteListBaseInfo extends AbstractModel {

    /**
    * Allowed item ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Number of images
    */
    @SerializedName("ImageCount")
    @Expose
    private Long ImageCount;

    /**
    * Connection process name
    */
    @SerializedName("ProcessName")
    @Expose
    private String ProcessName;

    /**
    * Destination address IP
    */
    @SerializedName("DstIp")
    @Expose
    private String DstIp;

    /**
    * Creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Update time
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Target port
    */
    @SerializedName("DstPort")
    @Expose
    private String DstPort;

    /**
    * Whether it is allowed globally. `true`: Yes.
    */
    @SerializedName("IsGlobal")
    @Expose
    private Boolean IsGlobal;

    /**
    * Array of image IDs. An empty array indicates all.
    */
    @SerializedName("ImageIds")
    @Expose
    private String [] ImageIds;

    /**
     * Get Allowed item ID 
     * @return Id Allowed item ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Allowed item ID
     * @param Id Allowed item ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Number of images 
     * @return ImageCount Number of images
     */
    public Long getImageCount() {
        return this.ImageCount;
    }

    /**
     * Set Number of images
     * @param ImageCount Number of images
     */
    public void setImageCount(Long ImageCount) {
        this.ImageCount = ImageCount;
    }

    /**
     * Get Connection process name 
     * @return ProcessName Connection process name
     */
    public String getProcessName() {
        return this.ProcessName;
    }

    /**
     * Set Connection process name
     * @param ProcessName Connection process name
     */
    public void setProcessName(String ProcessName) {
        this.ProcessName = ProcessName;
    }

    /**
     * Get Destination address IP 
     * @return DstIp Destination address IP
     */
    public String getDstIp() {
        return this.DstIp;
    }

    /**
     * Set Destination address IP
     * @param DstIp Destination address IP
     */
    public void setDstIp(String DstIp) {
        this.DstIp = DstIp;
    }

    /**
     * Get Creation time 
     * @return CreateTime Creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time
     * @param CreateTime Creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Update time 
     * @return UpdateTime Update time
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update time
     * @param UpdateTime Update time
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Target port 
     * @return DstPort Target port
     */
    public String getDstPort() {
        return this.DstPort;
    }

    /**
     * Set Target port
     * @param DstPort Target port
     */
    public void setDstPort(String DstPort) {
        this.DstPort = DstPort;
    }

    /**
     * Get Whether it is allowed globally. `true`: Yes. 
     * @return IsGlobal Whether it is allowed globally. `true`: Yes.
     */
    public Boolean getIsGlobal() {
        return this.IsGlobal;
    }

    /**
     * Set Whether it is allowed globally. `true`: Yes.
     * @param IsGlobal Whether it is allowed globally. `true`: Yes.
     */
    public void setIsGlobal(Boolean IsGlobal) {
        this.IsGlobal = IsGlobal;
    }

    /**
     * Get Array of image IDs. An empty array indicates all. 
     * @return ImageIds Array of image IDs. An empty array indicates all.
     */
    public String [] getImageIds() {
        return this.ImageIds;
    }

    /**
     * Set Array of image IDs. An empty array indicates all.
     * @param ImageIds Array of image IDs. An empty array indicates all.
     */
    public void setImageIds(String [] ImageIds) {
        this.ImageIds = ImageIds;
    }

    public ReverseShellWhiteListBaseInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReverseShellWhiteListBaseInfo(ReverseShellWhiteListBaseInfo source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.ImageCount != null) {
            this.ImageCount = new Long(source.ImageCount);
        }
        if (source.ProcessName != null) {
            this.ProcessName = new String(source.ProcessName);
        }
        if (source.DstIp != null) {
            this.DstIp = new String(source.DstIp);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.DstPort != null) {
            this.DstPort = new String(source.DstPort);
        }
        if (source.IsGlobal != null) {
            this.IsGlobal = new Boolean(source.IsGlobal);
        }
        if (source.ImageIds != null) {
            this.ImageIds = new String[source.ImageIds.length];
            for (int i = 0; i < source.ImageIds.length; i++) {
                this.ImageIds[i] = new String(source.ImageIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "ImageCount", this.ImageCount);
        this.setParamSimple(map, prefix + "ProcessName", this.ProcessName);
        this.setParamSimple(map, prefix + "DstIp", this.DstIp);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "DstPort", this.DstPort);
        this.setParamSimple(map, prefix + "IsGlobal", this.IsGlobal);
        this.setParamArraySimple(map, prefix + "ImageIds.", this.ImageIds);

    }
}

