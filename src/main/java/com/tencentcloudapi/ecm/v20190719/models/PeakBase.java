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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PeakBase extends AbstractModel {

    /**
    * Peak CPU
    */
    @SerializedName("PeakCpuNum")
    @Expose
    private Long PeakCpuNum;

    /**
    * Peak memory
    */
    @SerializedName("PeakMemoryNum")
    @Expose
    private Long PeakMemoryNum;

    /**
    * Peak disk
    */
    @SerializedName("PeakStorageNum")
    @Expose
    private Long PeakStorageNum;

    /**
    * Recording time
    */
    @SerializedName("RecordTime")
    @Expose
    private String RecordTime;

    /**
     * Get Peak CPU 
     * @return PeakCpuNum Peak CPU
     */
    public Long getPeakCpuNum() {
        return this.PeakCpuNum;
    }

    /**
     * Set Peak CPU
     * @param PeakCpuNum Peak CPU
     */
    public void setPeakCpuNum(Long PeakCpuNum) {
        this.PeakCpuNum = PeakCpuNum;
    }

    /**
     * Get Peak memory 
     * @return PeakMemoryNum Peak memory
     */
    public Long getPeakMemoryNum() {
        return this.PeakMemoryNum;
    }

    /**
     * Set Peak memory
     * @param PeakMemoryNum Peak memory
     */
    public void setPeakMemoryNum(Long PeakMemoryNum) {
        this.PeakMemoryNum = PeakMemoryNum;
    }

    /**
     * Get Peak disk 
     * @return PeakStorageNum Peak disk
     */
    public Long getPeakStorageNum() {
        return this.PeakStorageNum;
    }

    /**
     * Set Peak disk
     * @param PeakStorageNum Peak disk
     */
    public void setPeakStorageNum(Long PeakStorageNum) {
        this.PeakStorageNum = PeakStorageNum;
    }

    /**
     * Get Recording time 
     * @return RecordTime Recording time
     */
    public String getRecordTime() {
        return this.RecordTime;
    }

    /**
     * Set Recording time
     * @param RecordTime Recording time
     */
    public void setRecordTime(String RecordTime) {
        this.RecordTime = RecordTime;
    }

    public PeakBase() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PeakBase(PeakBase source) {
        if (source.PeakCpuNum != null) {
            this.PeakCpuNum = new Long(source.PeakCpuNum);
        }
        if (source.PeakMemoryNum != null) {
            this.PeakMemoryNum = new Long(source.PeakMemoryNum);
        }
        if (source.PeakStorageNum != null) {
            this.PeakStorageNum = new Long(source.PeakStorageNum);
        }
        if (source.RecordTime != null) {
            this.RecordTime = new String(source.RecordTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PeakCpuNum", this.PeakCpuNum);
        this.setParamSimple(map, prefix + "PeakMemoryNum", this.PeakMemoryNum);
        this.setParamSimple(map, prefix + "PeakStorageNum", this.PeakStorageNum);
        this.setParamSimple(map, prefix + "RecordTime", this.RecordTime);

    }
}

