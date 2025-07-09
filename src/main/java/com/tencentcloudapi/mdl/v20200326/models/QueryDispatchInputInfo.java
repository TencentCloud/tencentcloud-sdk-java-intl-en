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
package com.tencentcloudapi.mdl.v20200326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryDispatchInputInfo extends AbstractModel {

    /**
    * The input ID.
    */
    @SerializedName("InputID")
    @Expose
    private String InputID;

    /**
    * The input name.
    */
    @SerializedName("InputName")
    @Expose
    private String InputName;

    /**
    * The input protocol.
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * The stream status of the input.
    */
    @SerializedName("InputStreamInfoList")
    @Expose
    private InputStreamInfo [] InputStreamInfoList;

    /**
     * Get The input ID. 
     * @return InputID The input ID.
     */
    public String getInputID() {
        return this.InputID;
    }

    /**
     * Set The input ID.
     * @param InputID The input ID.
     */
    public void setInputID(String InputID) {
        this.InputID = InputID;
    }

    /**
     * Get The input name. 
     * @return InputName The input name.
     */
    public String getInputName() {
        return this.InputName;
    }

    /**
     * Set The input name.
     * @param InputName The input name.
     */
    public void setInputName(String InputName) {
        this.InputName = InputName;
    }

    /**
     * Get The input protocol. 
     * @return Protocol The input protocol.
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set The input protocol.
     * @param Protocol The input protocol.
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get The stream status of the input. 
     * @return InputStreamInfoList The stream status of the input.
     */
    public InputStreamInfo [] getInputStreamInfoList() {
        return this.InputStreamInfoList;
    }

    /**
     * Set The stream status of the input.
     * @param InputStreamInfoList The stream status of the input.
     */
    public void setInputStreamInfoList(InputStreamInfo [] InputStreamInfoList) {
        this.InputStreamInfoList = InputStreamInfoList;
    }

    public QueryDispatchInputInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryDispatchInputInfo(QueryDispatchInputInfo source) {
        if (source.InputID != null) {
            this.InputID = new String(source.InputID);
        }
        if (source.InputName != null) {
            this.InputName = new String(source.InputName);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.InputStreamInfoList != null) {
            this.InputStreamInfoList = new InputStreamInfo[source.InputStreamInfoList.length];
            for (int i = 0; i < source.InputStreamInfoList.length; i++) {
                this.InputStreamInfoList[i] = new InputStreamInfo(source.InputStreamInfoList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InputID", this.InputID);
        this.setParamSimple(map, prefix + "InputName", this.InputName);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamArrayObj(map, prefix + "InputStreamInfoList.", this.InputStreamInfoList);

    }
}

