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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceOperation extends AbstractModel {

    /**
    * Operation name, such as create_instance, and scaleout_instance
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Operation result. Success indicates success; Fail indicates failure.
    */
    @SerializedName("Result")
    @Expose
    private String Result;

    /**
    * Operation name description, such as create, and modify the cluster name
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * Operation level, such as Critical, Normal
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * Operation level description, such as high risk, and normal
    */
    @SerializedName("LevelDesc")
    @Expose
    private String LevelDesc;

    /**
    * Operation start time
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Operation end time
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Operation result description, such as Success and Fail.
    */
    @SerializedName("ResultDesc")
    @Expose
    private String ResultDesc;

    /**
    * Operation user ID
    */
    @SerializedName("OperateUin")
    @Expose
    private String OperateUin;

    /**
    * The jobid corresponding to the operation
    */
    @SerializedName("JobId")
    @Expose
    private Long JobId;

    /**
    * Operation details
    */
    @SerializedName("OperationDetail")
    @Expose
    private String OperationDetail;

    /**
     * Get Operation name, such as create_instance, and scaleout_instance 
     * @return Name Operation name, such as create_instance, and scaleout_instance
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Operation name, such as create_instance, and scaleout_instance
     * @param Name Operation name, such as create_instance, and scaleout_instance
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Operation result. Success indicates success; Fail indicates failure. 
     * @return Result Operation result. Success indicates success; Fail indicates failure.
     */
    public String getResult() {
        return this.Result;
    }

    /**
     * Set Operation result. Success indicates success; Fail indicates failure.
     * @param Result Operation result. Success indicates success; Fail indicates failure.
     */
    public void setResult(String Result) {
        this.Result = Result;
    }

    /**
     * Get Operation name description, such as create, and modify the cluster name 
     * @return Desc Operation name description, such as create, and modify the cluster name
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set Operation name description, such as create, and modify the cluster name
     * @param Desc Operation name description, such as create, and modify the cluster name
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    /**
     * Get Operation level, such as Critical, Normal 
     * @return Level Operation level, such as Critical, Normal
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set Operation level, such as Critical, Normal
     * @param Level Operation level, such as Critical, Normal
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get Operation level description, such as high risk, and normal 
     * @return LevelDesc Operation level description, such as high risk, and normal
     */
    public String getLevelDesc() {
        return this.LevelDesc;
    }

    /**
     * Set Operation level description, such as high risk, and normal
     * @param LevelDesc Operation level description, such as high risk, and normal
     */
    public void setLevelDesc(String LevelDesc) {
        this.LevelDesc = LevelDesc;
    }

    /**
     * Get Operation start time 
     * @return StartTime Operation start time
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Operation start time
     * @param StartTime Operation start time
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Operation end time 
     * @return EndTime Operation end time
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Operation end time
     * @param EndTime Operation end time
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Operation result description, such as Success and Fail. 
     * @return ResultDesc Operation result description, such as Success and Fail.
     */
    public String getResultDesc() {
        return this.ResultDesc;
    }

    /**
     * Set Operation result description, such as Success and Fail.
     * @param ResultDesc Operation result description, such as Success and Fail.
     */
    public void setResultDesc(String ResultDesc) {
        this.ResultDesc = ResultDesc;
    }

    /**
     * Get Operation user ID 
     * @return OperateUin Operation user ID
     */
    public String getOperateUin() {
        return this.OperateUin;
    }

    /**
     * Set Operation user ID
     * @param OperateUin Operation user ID
     */
    public void setOperateUin(String OperateUin) {
        this.OperateUin = OperateUin;
    }

    /**
     * Get The jobid corresponding to the operation 
     * @return JobId The jobid corresponding to the operation
     */
    public Long getJobId() {
        return this.JobId;
    }

    /**
     * Set The jobid corresponding to the operation
     * @param JobId The jobid corresponding to the operation
     */
    public void setJobId(Long JobId) {
        this.JobId = JobId;
    }

    /**
     * Get Operation details 
     * @return OperationDetail Operation details
     */
    public String getOperationDetail() {
        return this.OperationDetail;
    }

    /**
     * Set Operation details
     * @param OperationDetail Operation details
     */
    public void setOperationDetail(String OperationDetail) {
        this.OperationDetail = OperationDetail;
    }

    public InstanceOperation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceOperation(InstanceOperation source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Result != null) {
            this.Result = new String(source.Result);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
        if (source.Level != null) {
            this.Level = new String(source.Level);
        }
        if (source.LevelDesc != null) {
            this.LevelDesc = new String(source.LevelDesc);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.ResultDesc != null) {
            this.ResultDesc = new String(source.ResultDesc);
        }
        if (source.OperateUin != null) {
            this.OperateUin = new String(source.OperateUin);
        }
        if (source.JobId != null) {
            this.JobId = new Long(source.JobId);
        }
        if (source.OperationDetail != null) {
            this.OperationDetail = new String(source.OperationDetail);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamSimple(map, prefix + "Desc", this.Desc);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "LevelDesc", this.LevelDesc);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "ResultDesc", this.ResultDesc);
        this.setParamSimple(map, prefix + "OperateUin", this.OperateUin);
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "OperationDetail", this.OperationDetail);

    }
}

