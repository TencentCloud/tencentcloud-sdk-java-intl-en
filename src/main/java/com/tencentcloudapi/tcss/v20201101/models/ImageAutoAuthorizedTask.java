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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageAutoAuthorizedTask extends AbstractModel {

    /**
    * Task ID
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * Licensing method. Valid values: `AUTO` (automatic licensing); `MANUAL` (manual licensing).
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Task date
    */
    @SerializedName("AuthorizedDate")
    @Expose
    private String AuthorizedDate;

    /**
    * Image source. Valid values: `LOCAL` (local image); `REGISTRY` (repository image).
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * Last licensing time
    */
    @SerializedName("LastAuthorizedTime")
    @Expose
    private String LastAuthorizedTime;

    /**
    * Number of images automatically licensed successfully
    */
    @SerializedName("SuccessCount")
    @Expose
    private Long SuccessCount;

    /**
    * Number of images failed to be automatically licensed
    */
    @SerializedName("FailCount")
    @Expose
    private Long FailCount;

    /**
    * Error code for the last task. Valid values: `REACH_LIMIT` (reaching the upper limit on licenses); `LICENSE_INSUFFICIENT` (insufficient licenses).
    */
    @SerializedName("LatestFailCode")
    @Expose
    private String LatestFailCode;

    /**
     * Get Task ID 
     * @return TaskId Task ID
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Task ID
     * @param TaskId Task ID
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Licensing method. Valid values: `AUTO` (automatic licensing); `MANUAL` (manual licensing). 
     * @return Type Licensing method. Valid values: `AUTO` (automatic licensing); `MANUAL` (manual licensing).
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Licensing method. Valid values: `AUTO` (automatic licensing); `MANUAL` (manual licensing).
     * @param Type Licensing method. Valid values: `AUTO` (automatic licensing); `MANUAL` (manual licensing).
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Task date 
     * @return AuthorizedDate Task date
     */
    public String getAuthorizedDate() {
        return this.AuthorizedDate;
    }

    /**
     * Set Task date
     * @param AuthorizedDate Task date
     */
    public void setAuthorizedDate(String AuthorizedDate) {
        this.AuthorizedDate = AuthorizedDate;
    }

    /**
     * Get Image source. Valid values: `LOCAL` (local image); `REGISTRY` (repository image). 
     * @return Source Image source. Valid values: `LOCAL` (local image); `REGISTRY` (repository image).
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set Image source. Valid values: `LOCAL` (local image); `REGISTRY` (repository image).
     * @param Source Image source. Valid values: `LOCAL` (local image); `REGISTRY` (repository image).
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get Last licensing time 
     * @return LastAuthorizedTime Last licensing time
     */
    public String getLastAuthorizedTime() {
        return this.LastAuthorizedTime;
    }

    /**
     * Set Last licensing time
     * @param LastAuthorizedTime Last licensing time
     */
    public void setLastAuthorizedTime(String LastAuthorizedTime) {
        this.LastAuthorizedTime = LastAuthorizedTime;
    }

    /**
     * Get Number of images automatically licensed successfully 
     * @return SuccessCount Number of images automatically licensed successfully
     */
    public Long getSuccessCount() {
        return this.SuccessCount;
    }

    /**
     * Set Number of images automatically licensed successfully
     * @param SuccessCount Number of images automatically licensed successfully
     */
    public void setSuccessCount(Long SuccessCount) {
        this.SuccessCount = SuccessCount;
    }

    /**
     * Get Number of images failed to be automatically licensed 
     * @return FailCount Number of images failed to be automatically licensed
     */
    public Long getFailCount() {
        return this.FailCount;
    }

    /**
     * Set Number of images failed to be automatically licensed
     * @param FailCount Number of images failed to be automatically licensed
     */
    public void setFailCount(Long FailCount) {
        this.FailCount = FailCount;
    }

    /**
     * Get Error code for the last task. Valid values: `REACH_LIMIT` (reaching the upper limit on licenses); `LICENSE_INSUFFICIENT` (insufficient licenses). 
     * @return LatestFailCode Error code for the last task. Valid values: `REACH_LIMIT` (reaching the upper limit on licenses); `LICENSE_INSUFFICIENT` (insufficient licenses).
     */
    public String getLatestFailCode() {
        return this.LatestFailCode;
    }

    /**
     * Set Error code for the last task. Valid values: `REACH_LIMIT` (reaching the upper limit on licenses); `LICENSE_INSUFFICIENT` (insufficient licenses).
     * @param LatestFailCode Error code for the last task. Valid values: `REACH_LIMIT` (reaching the upper limit on licenses); `LICENSE_INSUFFICIENT` (insufficient licenses).
     */
    public void setLatestFailCode(String LatestFailCode) {
        this.LatestFailCode = LatestFailCode;
    }

    public ImageAutoAuthorizedTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageAutoAuthorizedTask(ImageAutoAuthorizedTask source) {
        if (source.TaskId != null) {
            this.TaskId = new Long(source.TaskId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.AuthorizedDate != null) {
            this.AuthorizedDate = new String(source.AuthorizedDate);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.LastAuthorizedTime != null) {
            this.LastAuthorizedTime = new String(source.LastAuthorizedTime);
        }
        if (source.SuccessCount != null) {
            this.SuccessCount = new Long(source.SuccessCount);
        }
        if (source.FailCount != null) {
            this.FailCount = new Long(source.FailCount);
        }
        if (source.LatestFailCode != null) {
            this.LatestFailCode = new String(source.LatestFailCode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "AuthorizedDate", this.AuthorizedDate);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "LastAuthorizedTime", this.LastAuthorizedTime);
        this.setParamSimple(map, prefix + "SuccessCount", this.SuccessCount);
        this.setParamSimple(map, prefix + "FailCount", this.FailCount);
        this.setParamSimple(map, prefix + "LatestFailCode", this.LatestFailCode);

    }
}

