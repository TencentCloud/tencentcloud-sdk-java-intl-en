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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StreamInfo extends AbstractModel{

    /**
    * Name of the application to which the live stream belongs
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * Creation mode
    */
    @SerializedName("CreateMode")
    @Expose
    private String CreateMode;

    /**
    * Creation time, such as 2018-07-13 14:48:23
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Stream status
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Stream ID
    */
    @SerializedName("StreamId")
    @Expose
    private String StreamId;

    /**
    * Stream name
    */
    @SerializedName("StreamName")
    @Expose
    private String StreamName;

    /**
    * Watermark ID
    */
    @SerializedName("WaterMarkId")
    @Expose
    private String WaterMarkId;

    /**
     * Get Name of the application to which the live stream belongs 
     * @return AppName Name of the application to which the live stream belongs
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set Name of the application to which the live stream belongs
     * @param AppName Name of the application to which the live stream belongs
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get Creation mode 
     * @return CreateMode Creation mode
     */
    public String getCreateMode() {
        return this.CreateMode;
    }

    /**
     * Set Creation mode
     * @param CreateMode Creation mode
     */
    public void setCreateMode(String CreateMode) {
        this.CreateMode = CreateMode;
    }

    /**
     * Get Creation time, such as 2018-07-13 14:48:23 
     * @return CreateTime Creation time, such as 2018-07-13 14:48:23
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time, such as 2018-07-13 14:48:23
     * @param CreateTime Creation time, such as 2018-07-13 14:48:23
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Stream status 
     * @return Status Stream status
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Stream status
     * @param Status Stream status
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Stream ID 
     * @return StreamId Stream ID
     */
    public String getStreamId() {
        return this.StreamId;
    }

    /**
     * Set Stream ID
     * @param StreamId Stream ID
     */
    public void setStreamId(String StreamId) {
        this.StreamId = StreamId;
    }

    /**
     * Get Stream name 
     * @return StreamName Stream name
     */
    public String getStreamName() {
        return this.StreamName;
    }

    /**
     * Set Stream name
     * @param StreamName Stream name
     */
    public void setStreamName(String StreamName) {
        this.StreamName = StreamName;
    }

    /**
     * Get Watermark ID 
     * @return WaterMarkId Watermark ID
     */
    public String getWaterMarkId() {
        return this.WaterMarkId;
    }

    /**
     * Set Watermark ID
     * @param WaterMarkId Watermark ID
     */
    public void setWaterMarkId(String WaterMarkId) {
        this.WaterMarkId = WaterMarkId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "CreateMode", this.CreateMode);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StreamId", this.StreamId);
        this.setParamSimple(map, prefix + "StreamName", this.StreamName);
        this.setParamSimple(map, prefix + "WaterMarkId", this.WaterMarkId);

    }
}

