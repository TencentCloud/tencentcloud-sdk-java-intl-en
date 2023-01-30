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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSecLogAlertMsgRequest extends AbstractModel{

    /**
    * Alert type
Log storage alert: log_reserve_full
Log storage period alert: log_save_day_limit
Unavailable Kafka instance/public domain name: kafka_instance_domain_unavailable
Incorrect Kafka username/password: kafka_user_passwd_wrong
Kafka backend error field: kafka_field_wrong
    */
    @SerializedName("Type")
    @Expose
    private String [] Type;

    /**
     * Get Alert type
Log storage alert: log_reserve_full
Log storage period alert: log_save_day_limit
Unavailable Kafka instance/public domain name: kafka_instance_domain_unavailable
Incorrect Kafka username/password: kafka_user_passwd_wrong
Kafka backend error field: kafka_field_wrong 
     * @return Type Alert type
Log storage alert: log_reserve_full
Log storage period alert: log_save_day_limit
Unavailable Kafka instance/public domain name: kafka_instance_domain_unavailable
Incorrect Kafka username/password: kafka_user_passwd_wrong
Kafka backend error field: kafka_field_wrong
     */
    public String [] getType() {
        return this.Type;
    }

    /**
     * Set Alert type
Log storage alert: log_reserve_full
Log storage period alert: log_save_day_limit
Unavailable Kafka instance/public domain name: kafka_instance_domain_unavailable
Incorrect Kafka username/password: kafka_user_passwd_wrong
Kafka backend error field: kafka_field_wrong
     * @param Type Alert type
Log storage alert: log_reserve_full
Log storage period alert: log_save_day_limit
Unavailable Kafka instance/public domain name: kafka_instance_domain_unavailable
Incorrect Kafka username/password: kafka_user_passwd_wrong
Kafka backend error field: kafka_field_wrong
     */
    public void setType(String [] Type) {
        this.Type = Type;
    }

    public DescribeSecLogAlertMsgRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSecLogAlertMsgRequest(DescribeSecLogAlertMsgRequest source) {
        if (source.Type != null) {
            this.Type = new String[source.Type.length];
            for (int i = 0; i < source.Type.length; i++) {
                this.Type[i] = new String(source.Type[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Type.", this.Type);

    }
}

