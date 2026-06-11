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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AlarmNoticeDeliverConfig extends AbstractModel {

    /**
    * Log shipping configuration information of a notification channel.
    */
    @SerializedName("DeliverConfig")
    @Expose
    private DeliverConfig DeliverConfig;

    /**
    * Shipping failure reason.
    */
    @SerializedName("ErrMsg")
    @Expose
    private String ErrMsg;

    /**
     * Get Log shipping configuration information of a notification channel. 
     * @return DeliverConfig Log shipping configuration information of a notification channel.
     */
    public DeliverConfig getDeliverConfig() {
        return this.DeliverConfig;
    }

    /**
     * Set Log shipping configuration information of a notification channel.
     * @param DeliverConfig Log shipping configuration information of a notification channel.
     */
    public void setDeliverConfig(DeliverConfig DeliverConfig) {
        this.DeliverConfig = DeliverConfig;
    }

    /**
     * Get Shipping failure reason. 
     * @return ErrMsg Shipping failure reason.
     */
    public String getErrMsg() {
        return this.ErrMsg;
    }

    /**
     * Set Shipping failure reason.
     * @param ErrMsg Shipping failure reason.
     */
    public void setErrMsg(String ErrMsg) {
        this.ErrMsg = ErrMsg;
    }

    public AlarmNoticeDeliverConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AlarmNoticeDeliverConfig(AlarmNoticeDeliverConfig source) {
        if (source.DeliverConfig != null) {
            this.DeliverConfig = new DeliverConfig(source.DeliverConfig);
        }
        if (source.ErrMsg != null) {
            this.ErrMsg = new String(source.ErrMsg);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "DeliverConfig.", this.DeliverConfig);
        this.setParamSimple(map, prefix + "ErrMsg", this.ErrMsg);

    }
}

