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
package com.tencentcloudapi.cfs.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDataFlowRequest extends AbstractModel {

    /**
    * Data flow manage ID, obtained through the api for querying data flow.
    */
    @SerializedName("DataFlowId")
    @Expose
    private String DataFlowId;

    /**
    * File system ID, which can be obtained by querying the file system through the [DescribeCfsFileSystems](https://www.tencentcloud.com/document/product/582/38170?from_cn_redirect=1) api.
    */
    @SerializedName("FileSystemId")
    @Expose
    private String FileSystemId;

    /**
    * Data flow name, supports no more than 64 characters in length, supports chinese, numbers, _, and -.
    */
    @SerializedName("DataFlowName")
    @Expose
    private String DataFlowName;

    /**
    * Key ID.
    */
    @SerializedName("SecretId")
    @Expose
    private String SecretId;

    /**
    * key.
    */
    @SerializedName("SecretKey")
    @Expose
    private String SecretKey;

    /**
    * Topic Parameter used by KafkaConsumer during consumption
    */
    @SerializedName("UserKafkaTopic")
    @Expose
    private String UserKafkaTopic;

    /**
    * Service address.
    */
    @SerializedName("ServerAddr")
    @Expose
    private String ServerAddr;

    /**
    * name
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * Kafka consuming user password.
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * Metadata incremental update switch; 1 enables, 0 disables.
    */
    @SerializedName("AutoRefresh")
    @Expose
    private Long AutoRefresh;

    /**
     * Get Data flow manage ID, obtained through the api for querying data flow. 
     * @return DataFlowId Data flow manage ID, obtained through the api for querying data flow.
     */
    public String getDataFlowId() {
        return this.DataFlowId;
    }

    /**
     * Set Data flow manage ID, obtained through the api for querying data flow.
     * @param DataFlowId Data flow manage ID, obtained through the api for querying data flow.
     */
    public void setDataFlowId(String DataFlowId) {
        this.DataFlowId = DataFlowId;
    }

    /**
     * Get File system ID, which can be obtained by querying the file system through the [DescribeCfsFileSystems](https://www.tencentcloud.com/document/product/582/38170?from_cn_redirect=1) api. 
     * @return FileSystemId File system ID, which can be obtained by querying the file system through the [DescribeCfsFileSystems](https://www.tencentcloud.com/document/product/582/38170?from_cn_redirect=1) api.
     */
    public String getFileSystemId() {
        return this.FileSystemId;
    }

    /**
     * Set File system ID, which can be obtained by querying the file system through the [DescribeCfsFileSystems](https://www.tencentcloud.com/document/product/582/38170?from_cn_redirect=1) api.
     * @param FileSystemId File system ID, which can be obtained by querying the file system through the [DescribeCfsFileSystems](https://www.tencentcloud.com/document/product/582/38170?from_cn_redirect=1) api.
     */
    public void setFileSystemId(String FileSystemId) {
        this.FileSystemId = FileSystemId;
    }

    /**
     * Get Data flow name, supports no more than 64 characters in length, supports chinese, numbers, _, and -. 
     * @return DataFlowName Data flow name, supports no more than 64 characters in length, supports chinese, numbers, _, and -.
     */
    public String getDataFlowName() {
        return this.DataFlowName;
    }

    /**
     * Set Data flow name, supports no more than 64 characters in length, supports chinese, numbers, _, and -.
     * @param DataFlowName Data flow name, supports no more than 64 characters in length, supports chinese, numbers, _, and -.
     */
    public void setDataFlowName(String DataFlowName) {
        this.DataFlowName = DataFlowName;
    }

    /**
     * Get Key ID. 
     * @return SecretId Key ID.
     */
    public String getSecretId() {
        return this.SecretId;
    }

    /**
     * Set Key ID.
     * @param SecretId Key ID.
     */
    public void setSecretId(String SecretId) {
        this.SecretId = SecretId;
    }

    /**
     * Get key. 
     * @return SecretKey key.
     */
    public String getSecretKey() {
        return this.SecretKey;
    }

    /**
     * Set key.
     * @param SecretKey key.
     */
    public void setSecretKey(String SecretKey) {
        this.SecretKey = SecretKey;
    }

    /**
     * Get Topic Parameter used by KafkaConsumer during consumption 
     * @return UserKafkaTopic Topic Parameter used by KafkaConsumer during consumption
     */
    public String getUserKafkaTopic() {
        return this.UserKafkaTopic;
    }

    /**
     * Set Topic Parameter used by KafkaConsumer during consumption
     * @param UserKafkaTopic Topic Parameter used by KafkaConsumer during consumption
     */
    public void setUserKafkaTopic(String UserKafkaTopic) {
        this.UserKafkaTopic = UserKafkaTopic;
    }

    /**
     * Get Service address. 
     * @return ServerAddr Service address.
     */
    public String getServerAddr() {
        return this.ServerAddr;
    }

    /**
     * Set Service address.
     * @param ServerAddr Service address.
     */
    public void setServerAddr(String ServerAddr) {
        this.ServerAddr = ServerAddr;
    }

    /**
     * Get name 
     * @return UserName name
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set name
     * @param UserName name
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get Kafka consuming user password. 
     * @return Password Kafka consuming user password.
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set Kafka consuming user password.
     * @param Password Kafka consuming user password.
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get Metadata incremental update switch; 1 enables, 0 disables. 
     * @return AutoRefresh Metadata incremental update switch; 1 enables, 0 disables.
     */
    public Long getAutoRefresh() {
        return this.AutoRefresh;
    }

    /**
     * Set Metadata incremental update switch; 1 enables, 0 disables.
     * @param AutoRefresh Metadata incremental update switch; 1 enables, 0 disables.
     */
    public void setAutoRefresh(Long AutoRefresh) {
        this.AutoRefresh = AutoRefresh;
    }

    public ModifyDataFlowRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDataFlowRequest(ModifyDataFlowRequest source) {
        if (source.DataFlowId != null) {
            this.DataFlowId = new String(source.DataFlowId);
        }
        if (source.FileSystemId != null) {
            this.FileSystemId = new String(source.FileSystemId);
        }
        if (source.DataFlowName != null) {
            this.DataFlowName = new String(source.DataFlowName);
        }
        if (source.SecretId != null) {
            this.SecretId = new String(source.SecretId);
        }
        if (source.SecretKey != null) {
            this.SecretKey = new String(source.SecretKey);
        }
        if (source.UserKafkaTopic != null) {
            this.UserKafkaTopic = new String(source.UserKafkaTopic);
        }
        if (source.ServerAddr != null) {
            this.ServerAddr = new String(source.ServerAddr);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.AutoRefresh != null) {
            this.AutoRefresh = new Long(source.AutoRefresh);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DataFlowId", this.DataFlowId);
        this.setParamSimple(map, prefix + "FileSystemId", this.FileSystemId);
        this.setParamSimple(map, prefix + "DataFlowName", this.DataFlowName);
        this.setParamSimple(map, prefix + "SecretId", this.SecretId);
        this.setParamSimple(map, prefix + "SecretKey", this.SecretKey);
        this.setParamSimple(map, prefix + "UserKafkaTopic", this.UserKafkaTopic);
        this.setParamSimple(map, prefix + "ServerAddr", this.ServerAddr);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "AutoRefresh", this.AutoRefresh);

    }
}

