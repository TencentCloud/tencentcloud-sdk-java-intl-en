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

public class CreateInstancePreResp extends AbstractModel{

    /**
    * Returned code. 0: Normal; other values: Error.
    */
    @SerializedName("ReturnCode")
    @Expose
    private String ReturnCode;

    /**
    * The message indicating whether the operation is successful.
    */
    @SerializedName("ReturnMessage")
    @Expose
    private String ReturnMessage;

    /**
    * Data returned by the operation.
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Data")
    @Expose
    private CreateInstancePreData Data;

    /**
    * Deletion time.  This parameter has been deprecated and will be deleted.  Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DeleteRouteTimestamp")
    @Expose
    private String DeleteRouteTimestamp;

    /**
     * Get Returned code. 0: Normal; other values: Error. 
     * @return ReturnCode Returned code. 0: Normal; other values: Error.
     */
    public String getReturnCode() {
        return this.ReturnCode;
    }

    /**
     * Set Returned code. 0: Normal; other values: Error.
     * @param ReturnCode Returned code. 0: Normal; other values: Error.
     */
    public void setReturnCode(String ReturnCode) {
        this.ReturnCode = ReturnCode;
    }

    /**
     * Get The message indicating whether the operation is successful. 
     * @return ReturnMessage The message indicating whether the operation is successful.
     */
    public String getReturnMessage() {
        return this.ReturnMessage;
    }

    /**
     * Set The message indicating whether the operation is successful.
     * @param ReturnMessage The message indicating whether the operation is successful.
     */
    public void setReturnMessage(String ReturnMessage) {
        this.ReturnMessage = ReturnMessage;
    }

    /**
     * Get Data returned by the operation.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return Data Data returned by the operation.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public CreateInstancePreData getData() {
        return this.Data;
    }

    /**
     * Set Data returned by the operation.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param Data Data returned by the operation.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setData(CreateInstancePreData Data) {
        this.Data = Data;
    }

    /**
     * Get Deletion time.  This parameter has been deprecated and will be deleted.  Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DeleteRouteTimestamp Deletion time.  This parameter has been deprecated and will be deleted.  Note: This field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public String getDeleteRouteTimestamp() {
        return this.DeleteRouteTimestamp;
    }

    /**
     * Set Deletion time.  This parameter has been deprecated and will be deleted.  Note: This field may return null, indicating that no valid values can be obtained.
     * @param DeleteRouteTimestamp Deletion time.  This parameter has been deprecated and will be deleted.  Note: This field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public void setDeleteRouteTimestamp(String DeleteRouteTimestamp) {
        this.DeleteRouteTimestamp = DeleteRouteTimestamp;
    }

    public CreateInstancePreResp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateInstancePreResp(CreateInstancePreResp source) {
        if (source.ReturnCode != null) {
            this.ReturnCode = new String(source.ReturnCode);
        }
        if (source.ReturnMessage != null) {
            this.ReturnMessage = new String(source.ReturnMessage);
        }
        if (source.Data != null) {
            this.Data = new CreateInstancePreData(source.Data);
        }
        if (source.DeleteRouteTimestamp != null) {
            this.DeleteRouteTimestamp = new String(source.DeleteRouteTimestamp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReturnCode", this.ReturnCode);
        this.setParamSimple(map, prefix + "ReturnMessage", this.ReturnMessage);
        this.setParamObj(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "DeleteRouteTimestamp", this.DeleteRouteTimestamp);

    }
}

