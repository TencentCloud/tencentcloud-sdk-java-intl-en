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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CheckItem extends AbstractModel {

    /**
    * 
    */
    @SerializedName("CheckName")
    @Expose
    private String CheckName;

    /**
    * 
    */
    @SerializedName("CurrentValue")
    @Expose
    private String CurrentValue;

    /**
    * 
    */
    @SerializedName("Passed")
    @Expose
    private Long Passed;

    /**
    * 
    */
    @SerializedName("IsAffect")
    @Expose
    private Long IsAffect;

    /**
    * 
    */
    @SerializedName("Msg")
    @Expose
    private String Msg;

    /**
    * 
    */
    @SerializedName("MsgCode")
    @Expose
    private Long MsgCode;

    /**
     * Get  
     * @return CheckName 
     */
    public String getCheckName() {
        return this.CheckName;
    }

    /**
     * Set 
     * @param CheckName 
     */
    public void setCheckName(String CheckName) {
        this.CheckName = CheckName;
    }

    /**
     * Get  
     * @return CurrentValue 
     */
    public String getCurrentValue() {
        return this.CurrentValue;
    }

    /**
     * Set 
     * @param CurrentValue 
     */
    public void setCurrentValue(String CurrentValue) {
        this.CurrentValue = CurrentValue;
    }

    /**
     * Get  
     * @return Passed 
     */
    public Long getPassed() {
        return this.Passed;
    }

    /**
     * Set 
     * @param Passed 
     */
    public void setPassed(Long Passed) {
        this.Passed = Passed;
    }

    /**
     * Get  
     * @return IsAffect 
     */
    public Long getIsAffect() {
        return this.IsAffect;
    }

    /**
     * Set 
     * @param IsAffect 
     */
    public void setIsAffect(Long IsAffect) {
        this.IsAffect = IsAffect;
    }

    /**
     * Get  
     * @return Msg 
     */
    public String getMsg() {
        return this.Msg;
    }

    /**
     * Set 
     * @param Msg 
     */
    public void setMsg(String Msg) {
        this.Msg = Msg;
    }

    /**
     * Get  
     * @return MsgCode 
     */
    public Long getMsgCode() {
        return this.MsgCode;
    }

    /**
     * Set 
     * @param MsgCode 
     */
    public void setMsgCode(Long MsgCode) {
        this.MsgCode = MsgCode;
    }

    public CheckItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckItem(CheckItem source) {
        if (source.CheckName != null) {
            this.CheckName = new String(source.CheckName);
        }
        if (source.CurrentValue != null) {
            this.CurrentValue = new String(source.CurrentValue);
        }
        if (source.Passed != null) {
            this.Passed = new Long(source.Passed);
        }
        if (source.IsAffect != null) {
            this.IsAffect = new Long(source.IsAffect);
        }
        if (source.Msg != null) {
            this.Msg = new String(source.Msg);
        }
        if (source.MsgCode != null) {
            this.MsgCode = new Long(source.MsgCode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CheckName", this.CheckName);
        this.setParamSimple(map, prefix + "CurrentValue", this.CurrentValue);
        this.setParamSimple(map, prefix + "Passed", this.Passed);
        this.setParamSimple(map, prefix + "IsAffect", this.IsAffect);
        this.setParamSimple(map, prefix + "Msg", this.Msg);
        this.setParamSimple(map, prefix + "MsgCode", this.MsgCode);

    }
}

