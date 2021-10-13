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
package com.tencentcloudapi.gme.v20180711.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeScanResult extends AbstractModel{

    /**
    * Business return code
    */
    @SerializedName("Code")
    @Expose
    private Long Code;

    /**
    * Unique data ID
    */
    @SerializedName("DataId")
    @Expose
    private String DataId;

    /**
    * Detection completion timestamp
    */
    @SerializedName("ScanFinishTime")
    @Expose
    private Long ScanFinishTime;

    /**
    * Whether non-compliant information is detected
    */
    @SerializedName("HitFlag")
    @Expose
    private Boolean HitFlag;

    /**
    * Whether it is a stream
    */
    @SerializedName("Live")
    @Expose
    private Boolean Live;

    /**
    * Business return description
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Msg")
    @Expose
    private String Msg;

    /**
    * Detection result, which will be returned if `Code` is 0
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ScanPiece")
    @Expose
    private ScanPiece [] ScanPiece;

    /**
    * Detection task submission timestamp
    */
    @SerializedName("ScanStartTime")
    @Expose
    private Long ScanStartTime;

    /**
    * Speech detection scenario, which corresponds to the `Scene` at the time of request
    */
    @SerializedName("Scenes")
    @Expose
    private String [] Scenes;

    /**
    * Speech detection task ID, which is assigned by the backend
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * File or stream address
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * Detection task execution result task. Valid values:
<li>Start: task started</li>
<li>Success: task ended successfully</li>
<li>Error: exceptional</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * ID of the application submitted for detection
    */
    @SerializedName("BizId")
    @Expose
    private Long BizId;

    /**
     * Get Business return code 
     * @return Code Business return code
     */
    public Long getCode() {
        return this.Code;
    }

    /**
     * Set Business return code
     * @param Code Business return code
     */
    public void setCode(Long Code) {
        this.Code = Code;
    }

    /**
     * Get Unique data ID 
     * @return DataId Unique data ID
     */
    public String getDataId() {
        return this.DataId;
    }

    /**
     * Set Unique data ID
     * @param DataId Unique data ID
     */
    public void setDataId(String DataId) {
        this.DataId = DataId;
    }

    /**
     * Get Detection completion timestamp 
     * @return ScanFinishTime Detection completion timestamp
     */
    public Long getScanFinishTime() {
        return this.ScanFinishTime;
    }

    /**
     * Set Detection completion timestamp
     * @param ScanFinishTime Detection completion timestamp
     */
    public void setScanFinishTime(Long ScanFinishTime) {
        this.ScanFinishTime = ScanFinishTime;
    }

    /**
     * Get Whether non-compliant information is detected 
     * @return HitFlag Whether non-compliant information is detected
     */
    public Boolean getHitFlag() {
        return this.HitFlag;
    }

    /**
     * Set Whether non-compliant information is detected
     * @param HitFlag Whether non-compliant information is detected
     */
    public void setHitFlag(Boolean HitFlag) {
        this.HitFlag = HitFlag;
    }

    /**
     * Get Whether it is a stream 
     * @return Live Whether it is a stream
     */
    public Boolean getLive() {
        return this.Live;
    }

    /**
     * Set Whether it is a stream
     * @param Live Whether it is a stream
     */
    public void setLive(Boolean Live) {
        this.Live = Live;
    }

    /**
     * Get Business return description
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Msg Business return description
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getMsg() {
        return this.Msg;
    }

    /**
     * Set Business return description
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Msg Business return description
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setMsg(String Msg) {
        this.Msg = Msg;
    }

    /**
     * Get Detection result, which will be returned if `Code` is 0
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ScanPiece Detection result, which will be returned if `Code` is 0
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public ScanPiece [] getScanPiece() {
        return this.ScanPiece;
    }

    /**
     * Set Detection result, which will be returned if `Code` is 0
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ScanPiece Detection result, which will be returned if `Code` is 0
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setScanPiece(ScanPiece [] ScanPiece) {
        this.ScanPiece = ScanPiece;
    }

    /**
     * Get Detection task submission timestamp 
     * @return ScanStartTime Detection task submission timestamp
     */
    public Long getScanStartTime() {
        return this.ScanStartTime;
    }

    /**
     * Set Detection task submission timestamp
     * @param ScanStartTime Detection task submission timestamp
     */
    public void setScanStartTime(Long ScanStartTime) {
        this.ScanStartTime = ScanStartTime;
    }

    /**
     * Get Speech detection scenario, which corresponds to the `Scene` at the time of request 
     * @return Scenes Speech detection scenario, which corresponds to the `Scene` at the time of request
     */
    public String [] getScenes() {
        return this.Scenes;
    }

    /**
     * Set Speech detection scenario, which corresponds to the `Scene` at the time of request
     * @param Scenes Speech detection scenario, which corresponds to the `Scene` at the time of request
     */
    public void setScenes(String [] Scenes) {
        this.Scenes = Scenes;
    }

    /**
     * Get Speech detection task ID, which is assigned by the backend 
     * @return TaskId Speech detection task ID, which is assigned by the backend
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Speech detection task ID, which is assigned by the backend
     * @param TaskId Speech detection task ID, which is assigned by the backend
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get File or stream address 
     * @return Url File or stream address
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set File or stream address
     * @param Url File or stream address
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get Detection task execution result task. Valid values:
<li>Start: task started</li>
<li>Success: task ended successfully</li>
<li>Error: exceptional</li> 
     * @return Status Detection task execution result task. Valid values:
<li>Start: task started</li>
<li>Success: task ended successfully</li>
<li>Error: exceptional</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Detection task execution result task. Valid values:
<li>Start: task started</li>
<li>Success: task ended successfully</li>
<li>Error: exceptional</li>
     * @param Status Detection task execution result task. Valid values:
<li>Start: task started</li>
<li>Success: task ended successfully</li>
<li>Error: exceptional</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get ID of the application submitted for detection 
     * @return BizId ID of the application submitted for detection
     */
    public Long getBizId() {
        return this.BizId;
    }

    /**
     * Set ID of the application submitted for detection
     * @param BizId ID of the application submitted for detection
     */
    public void setBizId(Long BizId) {
        this.BizId = BizId;
    }

    public DescribeScanResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeScanResult(DescribeScanResult source) {
        if (source.Code != null) {
            this.Code = new Long(source.Code);
        }
        if (source.DataId != null) {
            this.DataId = new String(source.DataId);
        }
        if (source.ScanFinishTime != null) {
            this.ScanFinishTime = new Long(source.ScanFinishTime);
        }
        if (source.HitFlag != null) {
            this.HitFlag = new Boolean(source.HitFlag);
        }
        if (source.Live != null) {
            this.Live = new Boolean(source.Live);
        }
        if (source.Msg != null) {
            this.Msg = new String(source.Msg);
        }
        if (source.ScanPiece != null) {
            this.ScanPiece = new ScanPiece[source.ScanPiece.length];
            for (int i = 0; i < source.ScanPiece.length; i++) {
                this.ScanPiece[i] = new ScanPiece(source.ScanPiece[i]);
            }
        }
        if (source.ScanStartTime != null) {
            this.ScanStartTime = new Long(source.ScanStartTime);
        }
        if (source.Scenes != null) {
            this.Scenes = new String[source.Scenes.length];
            for (int i = 0; i < source.Scenes.length; i++) {
                this.Scenes[i] = new String(source.Scenes[i]);
            }
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.BizId != null) {
            this.BizId = new Long(source.BizId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "DataId", this.DataId);
        this.setParamSimple(map, prefix + "ScanFinishTime", this.ScanFinishTime);
        this.setParamSimple(map, prefix + "HitFlag", this.HitFlag);
        this.setParamSimple(map, prefix + "Live", this.Live);
        this.setParamSimple(map, prefix + "Msg", this.Msg);
        this.setParamArrayObj(map, prefix + "ScanPiece.", this.ScanPiece);
        this.setParamSimple(map, prefix + "ScanStartTime", this.ScanStartTime);
        this.setParamArraySimple(map, prefix + "Scenes.", this.Scenes);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "BizId", this.BizId);

    }
}

