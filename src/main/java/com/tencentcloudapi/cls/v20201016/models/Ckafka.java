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

public class Ckafka extends AbstractModel {

    /**
    * InstanceId of Ckafka.
- Obtain the instance id by searching the instance list information (https://www.tencentcloud.com/document/product/597/40835?from_cn_redirect=1).
- Obtain the instance id by [creating an instance](https://www.tencentcloud.com/document/product/597/53207?from_cn_redirect=1).
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * TopicName of Ckafka
-Obtain the TopicName by creating a topic (https://www.tencentcloud.com/document/product/597/73566?from_cn_redirect=1).
-Obtain the TopicName through [Get Topic List](https://www.tencentcloud.com/document/product/597/40847?from_cn_redirect=1).
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * Vip of Ckafka.
- Obtain vip information by searching the instance attributes (https://www.tencentcloud.com/document/product/597/40836?from_cn_redirect=1).
-If the delivery task is created via the role ARN method, the Vip field can be empty.
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * Vport of Ckafka.
-Obtain vip port information by [obtaining instance attributes](https://www.tencentcloud.com/document/product/597/40836?from_cn_redirect=1).
-If it is created by the role ARN method, the Vport field can be empty.
    */
    @SerializedName("Vport")
    @Expose
    private String Vport;

    /**
    * InstanceName of Ckafka.
- Obtain the InstanceName by searching the instance list information (https://www.tencentcloud.com/document/product/597/40835?from_cn_redirect=1).
-Get InstanceName by [creating an instance](https://www.tencentcloud.com/document/product/597/53207?from_cn_redirect=1).
- If the delivery task is created via the role ARN method, the InstanceName field can be empty.
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Topic ID of Ckafka.
-Obtain the TopicId by creating a topic (https://www.tencentcloud.com/document/product/597/73566?from_cn_redirect=1).
-Obtain the TopicId through [Get Topic List](https://www.tencentcloud.com/document/product/597/40847?from_cn_redirect=1).
- If the delivery task is created via the role ARN method, the TopicId field can be empty.
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
     * Get InstanceId of Ckafka.
- Obtain the instance id by searching the instance list information (https://www.tencentcloud.com/document/product/597/40835?from_cn_redirect=1).
- Obtain the instance id by [creating an instance](https://www.tencentcloud.com/document/product/597/53207?from_cn_redirect=1). 
     * @return InstanceId InstanceId of Ckafka.
- Obtain the instance id by searching the instance list information (https://www.tencentcloud.com/document/product/597/40835?from_cn_redirect=1).
- Obtain the instance id by [creating an instance](https://www.tencentcloud.com/document/product/597/53207?from_cn_redirect=1).
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set InstanceId of Ckafka.
- Obtain the instance id by searching the instance list information (https://www.tencentcloud.com/document/product/597/40835?from_cn_redirect=1).
- Obtain the instance id by [creating an instance](https://www.tencentcloud.com/document/product/597/53207?from_cn_redirect=1).
     * @param InstanceId InstanceId of Ckafka.
- Obtain the instance id by searching the instance list information (https://www.tencentcloud.com/document/product/597/40835?from_cn_redirect=1).
- Obtain the instance id by [creating an instance](https://www.tencentcloud.com/document/product/597/53207?from_cn_redirect=1).
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get TopicName of Ckafka
-Obtain the TopicName by creating a topic (https://www.tencentcloud.com/document/product/597/73566?from_cn_redirect=1).
-Obtain the TopicName through [Get Topic List](https://www.tencentcloud.com/document/product/597/40847?from_cn_redirect=1). 
     * @return TopicName TopicName of Ckafka
-Obtain the TopicName by creating a topic (https://www.tencentcloud.com/document/product/597/73566?from_cn_redirect=1).
-Obtain the TopicName through [Get Topic List](https://www.tencentcloud.com/document/product/597/40847?from_cn_redirect=1).
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set TopicName of Ckafka
-Obtain the TopicName by creating a topic (https://www.tencentcloud.com/document/product/597/73566?from_cn_redirect=1).
-Obtain the TopicName through [Get Topic List](https://www.tencentcloud.com/document/product/597/40847?from_cn_redirect=1).
     * @param TopicName TopicName of Ckafka
-Obtain the TopicName by creating a topic (https://www.tencentcloud.com/document/product/597/73566?from_cn_redirect=1).
-Obtain the TopicName through [Get Topic List](https://www.tencentcloud.com/document/product/597/40847?from_cn_redirect=1).
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get Vip of Ckafka.
- Obtain vip information by searching the instance attributes (https://www.tencentcloud.com/document/product/597/40836?from_cn_redirect=1).
-If the delivery task is created via the role ARN method, the Vip field can be empty. 
     * @return Vip Vip of Ckafka.
- Obtain vip information by searching the instance attributes (https://www.tencentcloud.com/document/product/597/40836?from_cn_redirect=1).
-If the delivery task is created via the role ARN method, the Vip field can be empty.
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set Vip of Ckafka.
- Obtain vip information by searching the instance attributes (https://www.tencentcloud.com/document/product/597/40836?from_cn_redirect=1).
-If the delivery task is created via the role ARN method, the Vip field can be empty.
     * @param Vip Vip of Ckafka.
- Obtain vip information by searching the instance attributes (https://www.tencentcloud.com/document/product/597/40836?from_cn_redirect=1).
-If the delivery task is created via the role ARN method, the Vip field can be empty.
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get Vport of Ckafka.
-Obtain vip port information by [obtaining instance attributes](https://www.tencentcloud.com/document/product/597/40836?from_cn_redirect=1).
-If it is created by the role ARN method, the Vport field can be empty. 
     * @return Vport Vport of Ckafka.
-Obtain vip port information by [obtaining instance attributes](https://www.tencentcloud.com/document/product/597/40836?from_cn_redirect=1).
-If it is created by the role ARN method, the Vport field can be empty.
     */
    public String getVport() {
        return this.Vport;
    }

    /**
     * Set Vport of Ckafka.
-Obtain vip port information by [obtaining instance attributes](https://www.tencentcloud.com/document/product/597/40836?from_cn_redirect=1).
-If it is created by the role ARN method, the Vport field can be empty.
     * @param Vport Vport of Ckafka.
-Obtain vip port information by [obtaining instance attributes](https://www.tencentcloud.com/document/product/597/40836?from_cn_redirect=1).
-If it is created by the role ARN method, the Vport field can be empty.
     */
    public void setVport(String Vport) {
        this.Vport = Vport;
    }

    /**
     * Get InstanceName of Ckafka.
- Obtain the InstanceName by searching the instance list information (https://www.tencentcloud.com/document/product/597/40835?from_cn_redirect=1).
-Get InstanceName by [creating an instance](https://www.tencentcloud.com/document/product/597/53207?from_cn_redirect=1).
- If the delivery task is created via the role ARN method, the InstanceName field can be empty. 
     * @return InstanceName InstanceName of Ckafka.
- Obtain the InstanceName by searching the instance list information (https://www.tencentcloud.com/document/product/597/40835?from_cn_redirect=1).
-Get InstanceName by [creating an instance](https://www.tencentcloud.com/document/product/597/53207?from_cn_redirect=1).
- If the delivery task is created via the role ARN method, the InstanceName field can be empty.
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set InstanceName of Ckafka.
- Obtain the InstanceName by searching the instance list information (https://www.tencentcloud.com/document/product/597/40835?from_cn_redirect=1).
-Get InstanceName by [creating an instance](https://www.tencentcloud.com/document/product/597/53207?from_cn_redirect=1).
- If the delivery task is created via the role ARN method, the InstanceName field can be empty.
     * @param InstanceName InstanceName of Ckafka.
- Obtain the InstanceName by searching the instance list information (https://www.tencentcloud.com/document/product/597/40835?from_cn_redirect=1).
-Get InstanceName by [creating an instance](https://www.tencentcloud.com/document/product/597/53207?from_cn_redirect=1).
- If the delivery task is created via the role ARN method, the InstanceName field can be empty.
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Topic ID of Ckafka.
-Obtain the TopicId by creating a topic (https://www.tencentcloud.com/document/product/597/73566?from_cn_redirect=1).
-Obtain the TopicId through [Get Topic List](https://www.tencentcloud.com/document/product/597/40847?from_cn_redirect=1).
- If the delivery task is created via the role ARN method, the TopicId field can be empty. 
     * @return TopicId Topic ID of Ckafka.
-Obtain the TopicId by creating a topic (https://www.tencentcloud.com/document/product/597/73566?from_cn_redirect=1).
-Obtain the TopicId through [Get Topic List](https://www.tencentcloud.com/document/product/597/40847?from_cn_redirect=1).
- If the delivery task is created via the role ARN method, the TopicId field can be empty.
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set Topic ID of Ckafka.
-Obtain the TopicId by creating a topic (https://www.tencentcloud.com/document/product/597/73566?from_cn_redirect=1).
-Obtain the TopicId through [Get Topic List](https://www.tencentcloud.com/document/product/597/40847?from_cn_redirect=1).
- If the delivery task is created via the role ARN method, the TopicId field can be empty.
     * @param TopicId Topic ID of Ckafka.
-Obtain the TopicId by creating a topic (https://www.tencentcloud.com/document/product/597/73566?from_cn_redirect=1).
-Obtain the TopicId through [Get Topic List](https://www.tencentcloud.com/document/product/597/40847?from_cn_redirect=1).
- If the delivery task is created via the role ARN method, the TopicId field can be empty.
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    public Ckafka() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Ckafka(Ckafka source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.Vport != null) {
            this.Vport = new String(source.Vport);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);

    }
}

