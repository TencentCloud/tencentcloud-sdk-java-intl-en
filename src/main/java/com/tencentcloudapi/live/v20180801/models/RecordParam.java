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

public class RecordParam extends AbstractModel{

    /**
    * Recording interval.
In seconds. Default value: 1,800.
Value range: 300–7,200.
This parameter is not valid for HLS, and a file is generated from push start to push end when HLS is recorded.
    */
    @SerializedName("RecordInterval")
    @Expose
    private Long RecordInterval;

    /**
    * Recording storage duration.
In seconds. Value range: 0–93,312,000.
0 represents permanent storage.
    */
    @SerializedName("StorageTime")
    @Expose
    private Long StorageTime;

    /**
    * Whether to enable recording in the current format. 0: no; 1: yes. Default value: 0.
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * VOD subapplication ID.
    */
    @SerializedName("VodSubAppId")
    @Expose
    private Long VodSubAppId;

    /**
     * Get Recording interval.
In seconds. Default value: 1,800.
Value range: 300–7,200.
This parameter is not valid for HLS, and a file is generated from push start to push end when HLS is recorded. 
     * @return RecordInterval Recording interval.
In seconds. Default value: 1,800.
Value range: 300–7,200.
This parameter is not valid for HLS, and a file is generated from push start to push end when HLS is recorded.
     */
    public Long getRecordInterval() {
        return this.RecordInterval;
    }

    /**
     * Set Recording interval.
In seconds. Default value: 1,800.
Value range: 300–7,200.
This parameter is not valid for HLS, and a file is generated from push start to push end when HLS is recorded.
     * @param RecordInterval Recording interval.
In seconds. Default value: 1,800.
Value range: 300–7,200.
This parameter is not valid for HLS, and a file is generated from push start to push end when HLS is recorded.
     */
    public void setRecordInterval(Long RecordInterval) {
        this.RecordInterval = RecordInterval;
    }

    /**
     * Get Recording storage duration.
In seconds. Value range: 0–93,312,000.
0 represents permanent storage. 
     * @return StorageTime Recording storage duration.
In seconds. Value range: 0–93,312,000.
0 represents permanent storage.
     */
    public Long getStorageTime() {
        return this.StorageTime;
    }

    /**
     * Set Recording storage duration.
In seconds. Value range: 0–93,312,000.
0 represents permanent storage.
     * @param StorageTime Recording storage duration.
In seconds. Value range: 0–93,312,000.
0 represents permanent storage.
     */
    public void setStorageTime(Long StorageTime) {
        this.StorageTime = StorageTime;
    }

    /**
     * Get Whether to enable recording in the current format. 0: no; 1: yes. Default value: 0. 
     * @return Enable Whether to enable recording in the current format. 0: no; 1: yes. Default value: 0.
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set Whether to enable recording in the current format. 0: no; 1: yes. Default value: 0.
     * @param Enable Whether to enable recording in the current format. 0: no; 1: yes. Default value: 0.
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    /**
     * Get VOD subapplication ID. 
     * @return VodSubAppId VOD subapplication ID.
     */
    public Long getVodSubAppId() {
        return this.VodSubAppId;
    }

    /**
     * Set VOD subapplication ID.
     * @param VodSubAppId VOD subapplication ID.
     */
    public void setVodSubAppId(Long VodSubAppId) {
        this.VodSubAppId = VodSubAppId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RecordInterval", this.RecordInterval);
        this.setParamSimple(map, prefix + "StorageTime", this.StorageTime);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "VodSubAppId", this.VodSubAppId);

    }
}

