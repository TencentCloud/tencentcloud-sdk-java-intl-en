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

public class Overview extends AbstractModel {

    /**
    * Number of superapps.
    */
    @SerializedName("AppNum")
    @Expose
    private Long AppNum;

    /**
    * Number of teams.
    */
    @SerializedName("CorpNum")
    @Expose
    private Long CorpNum;

    /**
    * Refresh timestamp.
    */
    @SerializedName("FlushTime")
    @Expose
    private String FlushTime;

    /**
    * Number of mini programs.
    */
    @SerializedName("MiniAppNum")
    @Expose
    private Long MiniAppNum;

    /**
    * Number of mini games.
    */
    @SerializedName("MiniGameNum")
    @Expose
    private Long MiniGameNum;

    /**
    * Number of mini game visits.
    */
    @SerializedName("MiniGameVisitNum")
    @Expose
    private Long MiniGameVisitNum;

    /**
    * Number of mini program updates.
    */
    @SerializedName("UpdateNum")
    @Expose
    private Long UpdateNum;

    /**
    * Number of mini program visits.
    */
    @SerializedName("VisitNum")
    @Expose
    private Long VisitNum;

    /**
     * Get Number of superapps. 
     * @return AppNum Number of superapps.
     */
    public Long getAppNum() {
        return this.AppNum;
    }

    /**
     * Set Number of superapps.
     * @param AppNum Number of superapps.
     */
    public void setAppNum(Long AppNum) {
        this.AppNum = AppNum;
    }

    /**
     * Get Number of teams. 
     * @return CorpNum Number of teams.
     */
    public Long getCorpNum() {
        return this.CorpNum;
    }

    /**
     * Set Number of teams.
     * @param CorpNum Number of teams.
     */
    public void setCorpNum(Long CorpNum) {
        this.CorpNum = CorpNum;
    }

    /**
     * Get Refresh timestamp. 
     * @return FlushTime Refresh timestamp.
     */
    public String getFlushTime() {
        return this.FlushTime;
    }

    /**
     * Set Refresh timestamp.
     * @param FlushTime Refresh timestamp.
     */
    public void setFlushTime(String FlushTime) {
        this.FlushTime = FlushTime;
    }

    /**
     * Get Number of mini programs. 
     * @return MiniAppNum Number of mini programs.
     */
    public Long getMiniAppNum() {
        return this.MiniAppNum;
    }

    /**
     * Set Number of mini programs.
     * @param MiniAppNum Number of mini programs.
     */
    public void setMiniAppNum(Long MiniAppNum) {
        this.MiniAppNum = MiniAppNum;
    }

    /**
     * Get Number of mini games. 
     * @return MiniGameNum Number of mini games.
     */
    public Long getMiniGameNum() {
        return this.MiniGameNum;
    }

    /**
     * Set Number of mini games.
     * @param MiniGameNum Number of mini games.
     */
    public void setMiniGameNum(Long MiniGameNum) {
        this.MiniGameNum = MiniGameNum;
    }

    /**
     * Get Number of mini game visits. 
     * @return MiniGameVisitNum Number of mini game visits.
     */
    public Long getMiniGameVisitNum() {
        return this.MiniGameVisitNum;
    }

    /**
     * Set Number of mini game visits.
     * @param MiniGameVisitNum Number of mini game visits.
     */
    public void setMiniGameVisitNum(Long MiniGameVisitNum) {
        this.MiniGameVisitNum = MiniGameVisitNum;
    }

    /**
     * Get Number of mini program updates. 
     * @return UpdateNum Number of mini program updates.
     */
    public Long getUpdateNum() {
        return this.UpdateNum;
    }

    /**
     * Set Number of mini program updates.
     * @param UpdateNum Number of mini program updates.
     */
    public void setUpdateNum(Long UpdateNum) {
        this.UpdateNum = UpdateNum;
    }

    /**
     * Get Number of mini program visits. 
     * @return VisitNum Number of mini program visits.
     */
    public Long getVisitNum() {
        return this.VisitNum;
    }

    /**
     * Set Number of mini program visits.
     * @param VisitNum Number of mini program visits.
     */
    public void setVisitNum(Long VisitNum) {
        this.VisitNum = VisitNum;
    }

    public Overview() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Overview(Overview source) {
        if (source.AppNum != null) {
            this.AppNum = new Long(source.AppNum);
        }
        if (source.CorpNum != null) {
            this.CorpNum = new Long(source.CorpNum);
        }
        if (source.FlushTime != null) {
            this.FlushTime = new String(source.FlushTime);
        }
        if (source.MiniAppNum != null) {
            this.MiniAppNum = new Long(source.MiniAppNum);
        }
        if (source.MiniGameNum != null) {
            this.MiniGameNum = new Long(source.MiniGameNum);
        }
        if (source.MiniGameVisitNum != null) {
            this.MiniGameVisitNum = new Long(source.MiniGameVisitNum);
        }
        if (source.UpdateNum != null) {
            this.UpdateNum = new Long(source.UpdateNum);
        }
        if (source.VisitNum != null) {
            this.VisitNum = new Long(source.VisitNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppNum", this.AppNum);
        this.setParamSimple(map, prefix + "CorpNum", this.CorpNum);
        this.setParamSimple(map, prefix + "FlushTime", this.FlushTime);
        this.setParamSimple(map, prefix + "MiniAppNum", this.MiniAppNum);
        this.setParamSimple(map, prefix + "MiniGameNum", this.MiniGameNum);
        this.setParamSimple(map, prefix + "MiniGameVisitNum", this.MiniGameVisitNum);
        this.setParamSimple(map, prefix + "UpdateNum", this.UpdateNum);
        this.setParamSimple(map, prefix + "VisitNum", this.VisitNum);

    }
}

