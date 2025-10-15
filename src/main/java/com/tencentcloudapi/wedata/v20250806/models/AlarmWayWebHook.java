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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AlarmWayWebHook extends AbstractModel {

    /**
    * Specifies the Alarm channel value.
7. wecom group 8. lark group 9. dingtalk group 10. Slack group 11. Teams group.
    */
    @SerializedName("AlarmWay")
    @Expose
    private String AlarmWay;

    /**
    * webhook url list of the Alarm group.
    */
    @SerializedName("WebHooks")
    @Expose
    private String [] WebHooks;

    /**
     * Get Specifies the Alarm channel value.
7. wecom group 8. lark group 9. dingtalk group 10. Slack group 11. Teams group. 
     * @return AlarmWay Specifies the Alarm channel value.
7. wecom group 8. lark group 9. dingtalk group 10. Slack group 11. Teams group.
     */
    public String getAlarmWay() {
        return this.AlarmWay;
    }

    /**
     * Set Specifies the Alarm channel value.
7. wecom group 8. lark group 9. dingtalk group 10. Slack group 11. Teams group.
     * @param AlarmWay Specifies the Alarm channel value.
7. wecom group 8. lark group 9. dingtalk group 10. Slack group 11. Teams group.
     */
    public void setAlarmWay(String AlarmWay) {
        this.AlarmWay = AlarmWay;
    }

    /**
     * Get webhook url list of the Alarm group. 
     * @return WebHooks webhook url list of the Alarm group.
     */
    public String [] getWebHooks() {
        return this.WebHooks;
    }

    /**
     * Set webhook url list of the Alarm group.
     * @param WebHooks webhook url list of the Alarm group.
     */
    public void setWebHooks(String [] WebHooks) {
        this.WebHooks = WebHooks;
    }

    public AlarmWayWebHook() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AlarmWayWebHook(AlarmWayWebHook source) {
        if (source.AlarmWay != null) {
            this.AlarmWay = new String(source.AlarmWay);
        }
        if (source.WebHooks != null) {
            this.WebHooks = new String[source.WebHooks.length];
            for (int i = 0; i < source.WebHooks.length; i++) {
                this.WebHooks[i] = new String(source.WebHooks[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AlarmWay", this.AlarmWay);
        this.setParamArraySimple(map, prefix + "WebHooks.", this.WebHooks);

    }
}

