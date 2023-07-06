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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateInstancePostResp extends AbstractModel{

    /**
    * Returned code. `0` indicates normal status while other codes indicate errors.
    */
    @SerializedName("ReturnCode")
    @Expose
    private String ReturnCode;

    /**
    * Message returned by the API. An error message will be returned if the API reports an error. 
    */
    @SerializedName("ReturnMessage")
    @Expose
    private String ReturnMessage;

    /**
    * Returned data.  Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Data")
    @Expose
    private CreateInstancePostData Data;

    /**
     * Get Returned code. `0` indicates normal status while other codes indicate errors. 
     * @return ReturnCode Returned code. `0` indicates normal status while other codes indicate errors.
     */
    public String getReturnCode() {
        return this.ReturnCode;
    }

    /**
     * Set Returned code. `0` indicates normal status while other codes indicate errors.
     * @param ReturnCode Returned code. `0` indicates normal status while other codes indicate errors.
     */
    public void setReturnCode(String ReturnCode) {
        this.ReturnCode = ReturnCode;
    }

    /**
     * Get Message returned by the API. An error message will be returned if the API reports an error.  
     * @return ReturnMessage Message returned by the API. An error message will be returned if the API reports an error. 
     */
    public String getReturnMessage() {
        return this.ReturnMessage;
    }

    /**
     * Set Message returned by the API. An error message will be returned if the API reports an error. 
     * @param ReturnMessage Message returned by the API. An error message will be returned if the API reports an error. 
     */
    public void setReturnMessage(String ReturnMessage) {
        this.ReturnMessage = ReturnMessage;
    }

    /**
     * Get Returned data.  Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Data Returned data.  Note: This field may return null, indicating that no valid values can be obtained.
     */
    public CreateInstancePostData getData() {
        return this.Data;
    }

    /**
     * Set Returned data.  Note: This field may return null, indicating that no valid values can be obtained.
     * @param Data Returned data.  Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setData(CreateInstancePostData Data) {
        this.Data = Data;
    }

    public CreateInstancePostResp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateInstancePostResp(CreateInstancePostResp source) {
        if (source.ReturnCode != null) {
            this.ReturnCode = new String(source.ReturnCode);
        }
        if (source.ReturnMessage != null) {
            this.ReturnMessage = new String(source.ReturnMessage);
        }
        if (source.Data != null) {
            this.Data = new CreateInstancePostData(source.Data);
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

