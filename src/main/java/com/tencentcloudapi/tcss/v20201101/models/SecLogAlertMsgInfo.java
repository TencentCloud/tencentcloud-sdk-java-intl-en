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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SecLogAlertMsgInfo extends AbstractModel {

    /**
    * Alert type
    */
    @SerializedName("MsgType")
    @Expose
    private String MsgType;

    /**
    * Alert value
    */
    @SerializedName("MsgValue")
    @Expose
    private String MsgValue;

    /**
    * Status. Valid values: `0` (disabled); `1` (enabled).
    */
    @SerializedName("State")
    @Expose
    private Boolean State;

    /**
     * Get Alert type 
     * @return MsgType Alert type
     */
    public String getMsgType() {
        return this.MsgType;
    }

    /**
     * Set Alert type
     * @param MsgType Alert type
     */
    public void setMsgType(String MsgType) {
        this.MsgType = MsgType;
    }

    /**
     * Get Alert value 
     * @return MsgValue Alert value
     */
    public String getMsgValue() {
        return this.MsgValue;
    }

    /**
     * Set Alert value
     * @param MsgValue Alert value
     */
    public void setMsgValue(String MsgValue) {
        this.MsgValue = MsgValue;
    }

    /**
     * Get Status. Valid values: `0` (disabled); `1` (enabled). 
     * @return State Status. Valid values: `0` (disabled); `1` (enabled).
     */
    public Boolean getState() {
        return this.State;
    }

    /**
     * Set Status. Valid values: `0` (disabled); `1` (enabled).
     * @param State Status. Valid values: `0` (disabled); `1` (enabled).
     */
    public void setState(Boolean State) {
        this.State = State;
    }

    public SecLogAlertMsgInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SecLogAlertMsgInfo(SecLogAlertMsgInfo source) {
        if (source.MsgType != null) {
            this.MsgType = new String(source.MsgType);
        }
        if (source.MsgValue != null) {
            this.MsgValue = new String(source.MsgValue);
        }
        if (source.State != null) {
            this.State = new Boolean(source.State);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MsgType", this.MsgType);
        this.setParamSimple(map, prefix + "MsgValue", this.MsgValue);
        this.setParamSimple(map, prefix + "State", this.State);

    }
}

