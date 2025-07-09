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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyFunctionRequest extends AbstractModel {

    /**
    * Zone ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Function ID.
    */
    @SerializedName("FunctionId")
    @Expose
    private String FunctionId;

    /**
    * Function description, which can contain up to 60 characters. If this parameter is not input, the original configuration is maintained.
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Function content, which currently only supports JavaScript code. Its maximum size is 5 MB. If this parameter is not input, the original configuration is maintained.
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
     * Get Zone ID. 
     * @return ZoneId Zone ID.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Zone ID.
     * @param ZoneId Zone ID.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Function ID. 
     * @return FunctionId Function ID.
     */
    public String getFunctionId() {
        return this.FunctionId;
    }

    /**
     * Set Function ID.
     * @param FunctionId Function ID.
     */
    public void setFunctionId(String FunctionId) {
        this.FunctionId = FunctionId;
    }

    /**
     * Get Function description, which can contain up to 60 characters. If this parameter is not input, the original configuration is maintained. 
     * @return Remark Function description, which can contain up to 60 characters. If this parameter is not input, the original configuration is maintained.
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Function description, which can contain up to 60 characters. If this parameter is not input, the original configuration is maintained.
     * @param Remark Function description, which can contain up to 60 characters. If this parameter is not input, the original configuration is maintained.
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Function content, which currently only supports JavaScript code. Its maximum size is 5 MB. If this parameter is not input, the original configuration is maintained. 
     * @return Content Function content, which currently only supports JavaScript code. Its maximum size is 5 MB. If this parameter is not input, the original configuration is maintained.
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set Function content, which currently only supports JavaScript code. Its maximum size is 5 MB. If this parameter is not input, the original configuration is maintained.
     * @param Content Function content, which currently only supports JavaScript code. Its maximum size is 5 MB. If this parameter is not input, the original configuration is maintained.
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    public ModifyFunctionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyFunctionRequest(ModifyFunctionRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.FunctionId != null) {
            this.FunctionId = new String(source.FunctionId);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "FunctionId", this.FunctionId);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "Content", this.Content);

    }
}

