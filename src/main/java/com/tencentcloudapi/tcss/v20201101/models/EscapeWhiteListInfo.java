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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EscapeWhiteListInfo extends AbstractModel{

    /**
    * Image ID
    */
    @SerializedName("ImageID")
    @Expose
    private String ImageID;

    /**
    * Image name
    */
    @SerializedName("ImageName")
    @Expose
    private String ImageName;

    /**
    * Allowed item ID
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * Number of associated servers
    */
    @SerializedName("HostCount")
    @Expose
    private Long HostCount;

    /**
    * Number of associated containers
    */
    @SerializedName("ContainerCount")
    @Expose
    private Long ContainerCount;

    /**
    * Allowed event type
    */
    @SerializedName("EventType")
    @Expose
    private String [] EventType;

    /**
    * Creation time
    */
    @SerializedName("InsertTime")
    @Expose
    private String InsertTime;

    /**
    * Update time
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Image size
    */
    @SerializedName("ImageSize")
    @Expose
    private Long ImageSize;

    /**
     * Get Image ID 
     * @return ImageID Image ID
     */
    public String getImageID() {
        return this.ImageID;
    }

    /**
     * Set Image ID
     * @param ImageID Image ID
     */
    public void setImageID(String ImageID) {
        this.ImageID = ImageID;
    }

    /**
     * Get Image name 
     * @return ImageName Image name
     */
    public String getImageName() {
        return this.ImageName;
    }

    /**
     * Set Image name
     * @param ImageName Image name
     */
    public void setImageName(String ImageName) {
        this.ImageName = ImageName;
    }

    /**
     * Get Allowed item ID 
     * @return ID Allowed item ID
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set Allowed item ID
     * @param ID Allowed item ID
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get Number of associated servers 
     * @return HostCount Number of associated servers
     */
    public Long getHostCount() {
        return this.HostCount;
    }

    /**
     * Set Number of associated servers
     * @param HostCount Number of associated servers
     */
    public void setHostCount(Long HostCount) {
        this.HostCount = HostCount;
    }

    /**
     * Get Number of associated containers 
     * @return ContainerCount Number of associated containers
     */
    public Long getContainerCount() {
        return this.ContainerCount;
    }

    /**
     * Set Number of associated containers
     * @param ContainerCount Number of associated containers
     */
    public void setContainerCount(Long ContainerCount) {
        this.ContainerCount = ContainerCount;
    }

    /**
     * Get Allowed event type 
     * @return EventType Allowed event type
     */
    public String [] getEventType() {
        return this.EventType;
    }

    /**
     * Set Allowed event type
     * @param EventType Allowed event type
     */
    public void setEventType(String [] EventType) {
        this.EventType = EventType;
    }

    /**
     * Get Creation time 
     * @return InsertTime Creation time
     */
    public String getInsertTime() {
        return this.InsertTime;
    }

    /**
     * Set Creation time
     * @param InsertTime Creation time
     */
    public void setInsertTime(String InsertTime) {
        this.InsertTime = InsertTime;
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
     * Get Image size 
     * @return ImageSize Image size
     */
    public Long getImageSize() {
        return this.ImageSize;
    }

    /**
     * Set Image size
     * @param ImageSize Image size
     */
    public void setImageSize(Long ImageSize) {
        this.ImageSize = ImageSize;
    }

    public EscapeWhiteListInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EscapeWhiteListInfo(EscapeWhiteListInfo source) {
        if (source.ImageID != null) {
            this.ImageID = new String(source.ImageID);
        }
        if (source.ImageName != null) {
            this.ImageName = new String(source.ImageName);
        }
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.HostCount != null) {
            this.HostCount = new Long(source.HostCount);
        }
        if (source.ContainerCount != null) {
            this.ContainerCount = new Long(source.ContainerCount);
        }
        if (source.EventType != null) {
            this.EventType = new String[source.EventType.length];
            for (int i = 0; i < source.EventType.length; i++) {
                this.EventType[i] = new String(source.EventType[i]);
            }
        }
        if (source.InsertTime != null) {
            this.InsertTime = new String(source.InsertTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.ImageSize != null) {
            this.ImageSize = new Long(source.ImageSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageID", this.ImageID);
        this.setParamSimple(map, prefix + "ImageName", this.ImageName);
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "HostCount", this.HostCount);
        this.setParamSimple(map, prefix + "ContainerCount", this.ContainerCount);
        this.setParamArraySimple(map, prefix + "EventType.", this.EventType);
        this.setParamSimple(map, prefix + "InsertTime", this.InsertTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "ImageSize", this.ImageSize);

    }
}

