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

public class APPOverviewData extends AbstractModel {

    /**
    * Superapp active device count
    */
    @SerializedName("AllActiveDeviceNum")
    @Expose
    private Long AllActiveDeviceNum;

    /**
    * Superapp new device count
    */
    @SerializedName("AllNewDeviceNum")
    @Expose
    private Long AllNewDeviceNum;

    /**
    * Mini program team count
    */
    @SerializedName("CorpNum")
    @Expose
    private Long CorpNum;

    /**
    * Mini game active device count
    */
    @SerializedName("GameActiveDeviceNum")
    @Expose
    private Long GameActiveDeviceNum;

    /**
    * Mini game new device count
    */
    @SerializedName("GameNewDeviceNum")
    @Expose
    private Long GameNewDeviceNum;

    /**
    * Created mini program count

    */
    @SerializedName("MiniAppNum")
    @Expose
    private Long MiniAppNum;

    /**
    * Created mini game count

    */
    @SerializedName("MngNum")
    @Expose
    private Long MngNum;

    /**
    * Mini program new device count
    */
    @SerializedName("NewDeviceNum")
    @Expose
    private Long NewDeviceNum;

    /**
    * Released mini program count

    */
    @SerializedName("OnlineMiniAppNum")
    @Expose
    private Long OnlineMiniAppNum;

    /**
    * Released mini game count

    */
    @SerializedName("OnlineMngNum")
    @Expose
    private Long OnlineMngNum;

    /**
    * Mini program active device count
    */
    @SerializedName("VisitNum")
    @Expose
    private Long VisitNum;

    /**
    * Data refresh timestamp
    */
    @SerializedName("FlushTime")
    @Expose
    private String FlushTime;

    /**
     * Get Superapp active device count 
     * @return AllActiveDeviceNum Superapp active device count
     */
    public Long getAllActiveDeviceNum() {
        return this.AllActiveDeviceNum;
    }

    /**
     * Set Superapp active device count
     * @param AllActiveDeviceNum Superapp active device count
     */
    public void setAllActiveDeviceNum(Long AllActiveDeviceNum) {
        this.AllActiveDeviceNum = AllActiveDeviceNum;
    }

    /**
     * Get Superapp new device count 
     * @return AllNewDeviceNum Superapp new device count
     */
    public Long getAllNewDeviceNum() {
        return this.AllNewDeviceNum;
    }

    /**
     * Set Superapp new device count
     * @param AllNewDeviceNum Superapp new device count
     */
    public void setAllNewDeviceNum(Long AllNewDeviceNum) {
        this.AllNewDeviceNum = AllNewDeviceNum;
    }

    /**
     * Get Mini program team count 
     * @return CorpNum Mini program team count
     */
    public Long getCorpNum() {
        return this.CorpNum;
    }

    /**
     * Set Mini program team count
     * @param CorpNum Mini program team count
     */
    public void setCorpNum(Long CorpNum) {
        this.CorpNum = CorpNum;
    }

    /**
     * Get Mini game active device count 
     * @return GameActiveDeviceNum Mini game active device count
     */
    public Long getGameActiveDeviceNum() {
        return this.GameActiveDeviceNum;
    }

    /**
     * Set Mini game active device count
     * @param GameActiveDeviceNum Mini game active device count
     */
    public void setGameActiveDeviceNum(Long GameActiveDeviceNum) {
        this.GameActiveDeviceNum = GameActiveDeviceNum;
    }

    /**
     * Get Mini game new device count 
     * @return GameNewDeviceNum Mini game new device count
     */
    public Long getGameNewDeviceNum() {
        return this.GameNewDeviceNum;
    }

    /**
     * Set Mini game new device count
     * @param GameNewDeviceNum Mini game new device count
     */
    public void setGameNewDeviceNum(Long GameNewDeviceNum) {
        this.GameNewDeviceNum = GameNewDeviceNum;
    }

    /**
     * Get Created mini program count
 
     * @return MiniAppNum Created mini program count

     */
    public Long getMiniAppNum() {
        return this.MiniAppNum;
    }

    /**
     * Set Created mini program count

     * @param MiniAppNum Created mini program count

     */
    public void setMiniAppNum(Long MiniAppNum) {
        this.MiniAppNum = MiniAppNum;
    }

    /**
     * Get Created mini game count
 
     * @return MngNum Created mini game count

     */
    public Long getMngNum() {
        return this.MngNum;
    }

    /**
     * Set Created mini game count

     * @param MngNum Created mini game count

     */
    public void setMngNum(Long MngNum) {
        this.MngNum = MngNum;
    }

    /**
     * Get Mini program new device count 
     * @return NewDeviceNum Mini program new device count
     */
    public Long getNewDeviceNum() {
        return this.NewDeviceNum;
    }

    /**
     * Set Mini program new device count
     * @param NewDeviceNum Mini program new device count
     */
    public void setNewDeviceNum(Long NewDeviceNum) {
        this.NewDeviceNum = NewDeviceNum;
    }

    /**
     * Get Released mini program count
 
     * @return OnlineMiniAppNum Released mini program count

     */
    public Long getOnlineMiniAppNum() {
        return this.OnlineMiniAppNum;
    }

    /**
     * Set Released mini program count

     * @param OnlineMiniAppNum Released mini program count

     */
    public void setOnlineMiniAppNum(Long OnlineMiniAppNum) {
        this.OnlineMiniAppNum = OnlineMiniAppNum;
    }

    /**
     * Get Released mini game count
 
     * @return OnlineMngNum Released mini game count

     */
    public Long getOnlineMngNum() {
        return this.OnlineMngNum;
    }

    /**
     * Set Released mini game count

     * @param OnlineMngNum Released mini game count

     */
    public void setOnlineMngNum(Long OnlineMngNum) {
        this.OnlineMngNum = OnlineMngNum;
    }

    /**
     * Get Mini program active device count 
     * @return VisitNum Mini program active device count
     */
    public Long getVisitNum() {
        return this.VisitNum;
    }

    /**
     * Set Mini program active device count
     * @param VisitNum Mini program active device count
     */
    public void setVisitNum(Long VisitNum) {
        this.VisitNum = VisitNum;
    }

    /**
     * Get Data refresh timestamp 
     * @return FlushTime Data refresh timestamp
     */
    public String getFlushTime() {
        return this.FlushTime;
    }

    /**
     * Set Data refresh timestamp
     * @param FlushTime Data refresh timestamp
     */
    public void setFlushTime(String FlushTime) {
        this.FlushTime = FlushTime;
    }

    public APPOverviewData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public APPOverviewData(APPOverviewData source) {
        if (source.AllActiveDeviceNum != null) {
            this.AllActiveDeviceNum = new Long(source.AllActiveDeviceNum);
        }
        if (source.AllNewDeviceNum != null) {
            this.AllNewDeviceNum = new Long(source.AllNewDeviceNum);
        }
        if (source.CorpNum != null) {
            this.CorpNum = new Long(source.CorpNum);
        }
        if (source.GameActiveDeviceNum != null) {
            this.GameActiveDeviceNum = new Long(source.GameActiveDeviceNum);
        }
        if (source.GameNewDeviceNum != null) {
            this.GameNewDeviceNum = new Long(source.GameNewDeviceNum);
        }
        if (source.MiniAppNum != null) {
            this.MiniAppNum = new Long(source.MiniAppNum);
        }
        if (source.MngNum != null) {
            this.MngNum = new Long(source.MngNum);
        }
        if (source.NewDeviceNum != null) {
            this.NewDeviceNum = new Long(source.NewDeviceNum);
        }
        if (source.OnlineMiniAppNum != null) {
            this.OnlineMiniAppNum = new Long(source.OnlineMiniAppNum);
        }
        if (source.OnlineMngNum != null) {
            this.OnlineMngNum = new Long(source.OnlineMngNum);
        }
        if (source.VisitNum != null) {
            this.VisitNum = new Long(source.VisitNum);
        }
        if (source.FlushTime != null) {
            this.FlushTime = new String(source.FlushTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AllActiveDeviceNum", this.AllActiveDeviceNum);
        this.setParamSimple(map, prefix + "AllNewDeviceNum", this.AllNewDeviceNum);
        this.setParamSimple(map, prefix + "CorpNum", this.CorpNum);
        this.setParamSimple(map, prefix + "GameActiveDeviceNum", this.GameActiveDeviceNum);
        this.setParamSimple(map, prefix + "GameNewDeviceNum", this.GameNewDeviceNum);
        this.setParamSimple(map, prefix + "MiniAppNum", this.MiniAppNum);
        this.setParamSimple(map, prefix + "MngNum", this.MngNum);
        this.setParamSimple(map, prefix + "NewDeviceNum", this.NewDeviceNum);
        this.setParamSimple(map, prefix + "OnlineMiniAppNum", this.OnlineMiniAppNum);
        this.setParamSimple(map, prefix + "OnlineMngNum", this.OnlineMngNum);
        this.setParamSimple(map, prefix + "VisitNum", this.VisitNum);
        this.setParamSimple(map, prefix + "FlushTime", this.FlushTime);

    }
}

