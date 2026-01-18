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
package com.tencentcloudapi.tcsas.v20250106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AccessAnalysisDetail extends AbstractModel {

    /**
    * Number of active devices
    */
    @SerializedName("ActiveCount")
    @Expose
    private Long ActiveCount;

    /**
    * Average visit duration per user
    */
    @SerializedName("AvgDevice")
    @Expose
    private String AvgDevice;

    /**
    * Average visit duration per session
    */
    @SerializedName("AvgOnce")
    @Expose
    private String AvgOnce;

    /**
    * Average opens per user
    */
    @SerializedName("AvgOpenCount")
    @Expose
    private String AvgOpenCount;

    /**
    * Date
    */
    @SerializedName("DataTime")
    @Expose
    private String DataTime;

    /**
    * Data time
    */
    @SerializedName("FlushTime")
    @Expose
    private String FlushTime;

    /**
    * Number of new devices
    */
    @SerializedName("NewCount")
    @Expose
    private Long NewCount;

    /**
    * Number of opens
    */
    @SerializedName("OpenCount")
    @Expose
    private Long OpenCount;

    /**
    * Number of shares
    */
    @SerializedName("TotalShareNum")
    @Expose
    private Long TotalShareNum;

    /**
    * Cumulative users
    */
    @SerializedName("TotalUserNum")
    @Expose
    private Long TotalUserNum;

    /**
     * Get Number of active devices 
     * @return ActiveCount Number of active devices
     */
    public Long getActiveCount() {
        return this.ActiveCount;
    }

    /**
     * Set Number of active devices
     * @param ActiveCount Number of active devices
     */
    public void setActiveCount(Long ActiveCount) {
        this.ActiveCount = ActiveCount;
    }

    /**
     * Get Average visit duration per user 
     * @return AvgDevice Average visit duration per user
     */
    public String getAvgDevice() {
        return this.AvgDevice;
    }

    /**
     * Set Average visit duration per user
     * @param AvgDevice Average visit duration per user
     */
    public void setAvgDevice(String AvgDevice) {
        this.AvgDevice = AvgDevice;
    }

    /**
     * Get Average visit duration per session 
     * @return AvgOnce Average visit duration per session
     */
    public String getAvgOnce() {
        return this.AvgOnce;
    }

    /**
     * Set Average visit duration per session
     * @param AvgOnce Average visit duration per session
     */
    public void setAvgOnce(String AvgOnce) {
        this.AvgOnce = AvgOnce;
    }

    /**
     * Get Average opens per user 
     * @return AvgOpenCount Average opens per user
     */
    public String getAvgOpenCount() {
        return this.AvgOpenCount;
    }

    /**
     * Set Average opens per user
     * @param AvgOpenCount Average opens per user
     */
    public void setAvgOpenCount(String AvgOpenCount) {
        this.AvgOpenCount = AvgOpenCount;
    }

    /**
     * Get Date 
     * @return DataTime Date
     */
    public String getDataTime() {
        return this.DataTime;
    }

    /**
     * Set Date
     * @param DataTime Date
     */
    public void setDataTime(String DataTime) {
        this.DataTime = DataTime;
    }

    /**
     * Get Data time 
     * @return FlushTime Data time
     */
    public String getFlushTime() {
        return this.FlushTime;
    }

    /**
     * Set Data time
     * @param FlushTime Data time
     */
    public void setFlushTime(String FlushTime) {
        this.FlushTime = FlushTime;
    }

    /**
     * Get Number of new devices 
     * @return NewCount Number of new devices
     */
    public Long getNewCount() {
        return this.NewCount;
    }

    /**
     * Set Number of new devices
     * @param NewCount Number of new devices
     */
    public void setNewCount(Long NewCount) {
        this.NewCount = NewCount;
    }

    /**
     * Get Number of opens 
     * @return OpenCount Number of opens
     */
    public Long getOpenCount() {
        return this.OpenCount;
    }

    /**
     * Set Number of opens
     * @param OpenCount Number of opens
     */
    public void setOpenCount(Long OpenCount) {
        this.OpenCount = OpenCount;
    }

    /**
     * Get Number of shares 
     * @return TotalShareNum Number of shares
     */
    public Long getTotalShareNum() {
        return this.TotalShareNum;
    }

    /**
     * Set Number of shares
     * @param TotalShareNum Number of shares
     */
    public void setTotalShareNum(Long TotalShareNum) {
        this.TotalShareNum = TotalShareNum;
    }

    /**
     * Get Cumulative users 
     * @return TotalUserNum Cumulative users
     */
    public Long getTotalUserNum() {
        return this.TotalUserNum;
    }

    /**
     * Set Cumulative users
     * @param TotalUserNum Cumulative users
     */
    public void setTotalUserNum(Long TotalUserNum) {
        this.TotalUserNum = TotalUserNum;
    }

    public AccessAnalysisDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AccessAnalysisDetail(AccessAnalysisDetail source) {
        if (source.ActiveCount != null) {
            this.ActiveCount = new Long(source.ActiveCount);
        }
        if (source.AvgDevice != null) {
            this.AvgDevice = new String(source.AvgDevice);
        }
        if (source.AvgOnce != null) {
            this.AvgOnce = new String(source.AvgOnce);
        }
        if (source.AvgOpenCount != null) {
            this.AvgOpenCount = new String(source.AvgOpenCount);
        }
        if (source.DataTime != null) {
            this.DataTime = new String(source.DataTime);
        }
        if (source.FlushTime != null) {
            this.FlushTime = new String(source.FlushTime);
        }
        if (source.NewCount != null) {
            this.NewCount = new Long(source.NewCount);
        }
        if (source.OpenCount != null) {
            this.OpenCount = new Long(source.OpenCount);
        }
        if (source.TotalShareNum != null) {
            this.TotalShareNum = new Long(source.TotalShareNum);
        }
        if (source.TotalUserNum != null) {
            this.TotalUserNum = new Long(source.TotalUserNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ActiveCount", this.ActiveCount);
        this.setParamSimple(map, prefix + "AvgDevice", this.AvgDevice);
        this.setParamSimple(map, prefix + "AvgOnce", this.AvgOnce);
        this.setParamSimple(map, prefix + "AvgOpenCount", this.AvgOpenCount);
        this.setParamSimple(map, prefix + "DataTime", this.DataTime);
        this.setParamSimple(map, prefix + "FlushTime", this.FlushTime);
        this.setParamSimple(map, prefix + "NewCount", this.NewCount);
        this.setParamSimple(map, prefix + "OpenCount", this.OpenCount);
        this.setParamSimple(map, prefix + "TotalShareNum", this.TotalShareNum);
        this.setParamSimple(map, prefix + "TotalUserNum", this.TotalUserNum);

    }
}

