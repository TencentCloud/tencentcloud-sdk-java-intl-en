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
package com.tencentcloudapi.mdp.v20200527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VodRemuxTaskInfo extends AbstractModel {

    /**
    * VOD remux task ID.
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * VOD remux task name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * VOD remux task type.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * VOD remux task input file information.
    */
    @SerializedName("InputFileInfo")
    @Expose
    private InputFileInfo InputFileInfo;

    /**
    * VOD remux task output storage information.
    */
    @SerializedName("OutputStorage")
    @Expose
    private OutputStorage OutputStorage;

    /**
    * VOD remux task created time.
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * VOD remux task updated time.
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * VOD remux task's state.
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * VOD remux task's error message.
    */
    @SerializedName("ErrorMsg")
    @Expose
    private String ErrorMsg;

    /**
    * VOD remux task process started time.
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * VOD remux task process end time.
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * Common Params. For more information, please see the list of regions supported by the product.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
     * Get VOD remux task ID. 
     * @return Id VOD remux task ID.
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set VOD remux task ID.
     * @param Id VOD remux task ID.
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get VOD remux task name. 
     * @return Name VOD remux task name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set VOD remux task name.
     * @param Name VOD remux task name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get VOD remux task type. 
     * @return Type VOD remux task type.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set VOD remux task type.
     * @param Type VOD remux task type.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get VOD remux task input file information. 
     * @return InputFileInfo VOD remux task input file information.
     */
    public InputFileInfo getInputFileInfo() {
        return this.InputFileInfo;
    }

    /**
     * Set VOD remux task input file information.
     * @param InputFileInfo VOD remux task input file information.
     */
    public void setInputFileInfo(InputFileInfo InputFileInfo) {
        this.InputFileInfo = InputFileInfo;
    }

    /**
     * Get VOD remux task output storage information. 
     * @return OutputStorage VOD remux task output storage information.
     */
    public OutputStorage getOutputStorage() {
        return this.OutputStorage;
    }

    /**
     * Set VOD remux task output storage information.
     * @param OutputStorage VOD remux task output storage information.
     */
    public void setOutputStorage(OutputStorage OutputStorage) {
        this.OutputStorage = OutputStorage;
    }

    /**
     * Get VOD remux task created time. 
     * @return CreateTime VOD remux task created time.
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set VOD remux task created time.
     * @param CreateTime VOD remux task created time.
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get VOD remux task updated time. 
     * @return UpdateTime VOD remux task updated time.
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set VOD remux task updated time.
     * @param UpdateTime VOD remux task updated time.
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get VOD remux task's state. 
     * @return State VOD remux task's state.
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set VOD remux task's state.
     * @param State VOD remux task's state.
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get VOD remux task's error message. 
     * @return ErrorMsg VOD remux task's error message.
     */
    public String getErrorMsg() {
        return this.ErrorMsg;
    }

    /**
     * Set VOD remux task's error message.
     * @param ErrorMsg VOD remux task's error message.
     */
    public void setErrorMsg(String ErrorMsg) {
        this.ErrorMsg = ErrorMsg;
    }

    /**
     * Get VOD remux task process started time. 
     * @return StartTime VOD remux task process started time.
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set VOD remux task process started time.
     * @param StartTime VOD remux task process started time.
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get VOD remux task process end time. 
     * @return EndTime VOD remux task process end time.
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set VOD remux task process end time.
     * @param EndTime VOD remux task process end time.
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Common Params. For more information, please see the list of regions supported by the product. 
     * @return Region Common Params. For more information, please see the list of regions supported by the product.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Common Params. For more information, please see the list of regions supported by the product.
     * @param Region Common Params. For more information, please see the list of regions supported by the product.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    public VodRemuxTaskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VodRemuxTaskInfo(VodRemuxTaskInfo source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.InputFileInfo != null) {
            this.InputFileInfo = new InputFileInfo(source.InputFileInfo);
        }
        if (source.OutputStorage != null) {
            this.OutputStorage = new OutputStorage(source.OutputStorage);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.ErrorMsg != null) {
            this.ErrorMsg = new String(source.ErrorMsg);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "InputFileInfo.", this.InputFileInfo);
        this.setParamObj(map, prefix + "OutputStorage.", this.OutputStorage);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "ErrorMsg", this.ErrorMsg);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Region", this.Region);

    }
}

