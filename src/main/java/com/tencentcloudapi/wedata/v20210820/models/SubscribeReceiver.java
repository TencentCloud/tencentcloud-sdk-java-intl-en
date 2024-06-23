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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SubscribeReceiver extends AbstractModel {

    /**
    * Recipient Uin
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ReceiverUserId")
    @Expose
    private Long ReceiverUserId;

    /**
    * Recipient Name
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ReceiverName")
    @Expose
    private String ReceiverName;

    /**
    * 
    */
    @SerializedName("ReceiverUserIdStr")
    @Expose
    private String ReceiverUserIdStr;

    /**
     * Get Recipient Uin
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ReceiverUserId Recipient Uin
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getReceiverUserId() {
        return this.ReceiverUserId;
    }

    /**
     * Set Recipient Uin
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ReceiverUserId Recipient Uin
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setReceiverUserId(Long ReceiverUserId) {
        this.ReceiverUserId = ReceiverUserId;
    }

    /**
     * Get Recipient Name
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ReceiverName Recipient Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getReceiverName() {
        return this.ReceiverName;
    }

    /**
     * Set Recipient Name
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ReceiverName Recipient Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setReceiverName(String ReceiverName) {
        this.ReceiverName = ReceiverName;
    }

    /**
     * Get  
     * @return ReceiverUserIdStr 
     */
    public String getReceiverUserIdStr() {
        return this.ReceiverUserIdStr;
    }

    /**
     * Set 
     * @param ReceiverUserIdStr 
     */
    public void setReceiverUserIdStr(String ReceiverUserIdStr) {
        this.ReceiverUserIdStr = ReceiverUserIdStr;
    }

    public SubscribeReceiver() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubscribeReceiver(SubscribeReceiver source) {
        if (source.ReceiverUserId != null) {
            this.ReceiverUserId = new Long(source.ReceiverUserId);
        }
        if (source.ReceiverName != null) {
            this.ReceiverName = new String(source.ReceiverName);
        }
        if (source.ReceiverUserIdStr != null) {
            this.ReceiverUserIdStr = new String(source.ReceiverUserIdStr);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReceiverUserId", this.ReceiverUserId);
        this.setParamSimple(map, prefix + "ReceiverName", this.ReceiverName);
        this.setParamSimple(map, prefix + "ReceiverUserIdStr", this.ReceiverUserIdStr);

    }
}

