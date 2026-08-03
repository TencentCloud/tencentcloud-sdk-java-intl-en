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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class JgwOperateResponse extends AbstractModel {

    /**
    * <p>Returned code. 0 as normal, non-0 as error.</p>
    */
    @SerializedName("ReturnCode")
    @Expose
    private String ReturnCode;

    /**
    * <p>Success message</p>
    */
    @SerializedName("ReturnMessage")
    @Expose
    private String ReturnMessage;

    /**
    * <p>The Data returned by the operation may include flowId.</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Data")
    @Expose
    private OperateResponseData Data;

    /**
     * Get <p>Returned code. 0 as normal, non-0 as error.</p> 
     * @return ReturnCode <p>Returned code. 0 as normal, non-0 as error.</p>
     */
    public String getReturnCode() {
        return this.ReturnCode;
    }

    /**
     * Set <p>Returned code. 0 as normal, non-0 as error.</p>
     * @param ReturnCode <p>Returned code. 0 as normal, non-0 as error.</p>
     */
    public void setReturnCode(String ReturnCode) {
        this.ReturnCode = ReturnCode;
    }

    /**
     * Get <p>Success message</p> 
     * @return ReturnMessage <p>Success message</p>
     */
    public String getReturnMessage() {
        return this.ReturnMessage;
    }

    /**
     * Set <p>Success message</p>
     * @param ReturnMessage <p>Success message</p>
     */
    public void setReturnMessage(String ReturnMessage) {
        this.ReturnMessage = ReturnMessage;
    }

    /**
     * Get <p>The Data returned by the operation may include flowId.</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Data <p>The Data returned by the operation may include flowId.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public OperateResponseData getData() {
        return this.Data;
    }

    /**
     * Set <p>The Data returned by the operation may include flowId.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Data <p>The Data returned by the operation may include flowId.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setData(OperateResponseData Data) {
        this.Data = Data;
    }

    public JgwOperateResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public JgwOperateResponse(JgwOperateResponse source) {
        if (source.ReturnCode != null) {
            this.ReturnCode = new String(source.ReturnCode);
        }
        if (source.ReturnMessage != null) {
            this.ReturnMessage = new String(source.ReturnMessage);
        }
        if (source.Data != null) {
            this.Data = new OperateResponseData(source.Data);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReturnCode", this.ReturnCode);
        this.setParamSimple(map, prefix + "ReturnMessage", this.ReturnMessage);
        this.setParamObj(map, prefix + "Data.", this.Data);

    }
}

