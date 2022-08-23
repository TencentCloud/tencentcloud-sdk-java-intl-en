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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class McuLayoutVolume extends AbstractModel{

    /**
    * The application data, which will be embedded in the `app_data` field of the custom SEI. It must be shorter than 4,096 characters.
    */
    @SerializedName("AppData")
    @Expose
    private String AppData;

    /**
    * The payload type of the SEI message. The default is 100. Value range: 100-254 (244 is used internally by Tencent Cloud for timestamps).
    */
    @SerializedName("PayloadType")
    @Expose
    private Long PayloadType;

    /**
     * Get The application data, which will be embedded in the `app_data` field of the custom SEI. It must be shorter than 4,096 characters. 
     * @return AppData The application data, which will be embedded in the `app_data` field of the custom SEI. It must be shorter than 4,096 characters.
     */
    public String getAppData() {
        return this.AppData;
    }

    /**
     * Set The application data, which will be embedded in the `app_data` field of the custom SEI. It must be shorter than 4,096 characters.
     * @param AppData The application data, which will be embedded in the `app_data` field of the custom SEI. It must be shorter than 4,096 characters.
     */
    public void setAppData(String AppData) {
        this.AppData = AppData;
    }

    /**
     * Get The payload type of the SEI message. The default is 100. Value range: 100-254 (244 is used internally by Tencent Cloud for timestamps). 
     * @return PayloadType The payload type of the SEI message. The default is 100. Value range: 100-254 (244 is used internally by Tencent Cloud for timestamps).
     */
    public Long getPayloadType() {
        return this.PayloadType;
    }

    /**
     * Set The payload type of the SEI message. The default is 100. Value range: 100-254 (244 is used internally by Tencent Cloud for timestamps).
     * @param PayloadType The payload type of the SEI message. The default is 100. Value range: 100-254 (244 is used internally by Tencent Cloud for timestamps).
     */
    public void setPayloadType(Long PayloadType) {
        this.PayloadType = PayloadType;
    }

    public McuLayoutVolume() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public McuLayoutVolume(McuLayoutVolume source) {
        if (source.AppData != null) {
            this.AppData = new String(source.AppData);
        }
        if (source.PayloadType != null) {
            this.PayloadType = new Long(source.PayloadType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppData", this.AppData);
        this.setParamSimple(map, prefix + "PayloadType", this.PayloadType);

    }
}

