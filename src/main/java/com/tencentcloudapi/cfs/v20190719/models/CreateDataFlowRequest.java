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

public class CreateDataFlowRequest extends AbstractModel {

    /**
    * File system ID, which can be obtained by querying the file system through the [DescribeCfsFileSystems](https://www.tencentcloud.com/document/product/582/38170?from_cn_redirect=1) api.
    */
    @SerializedName("FileSystemId")
    @Expose
    private String FileSystemId;

    /**
    * Source data type; includes S3_COS, S3_L5.
    */
    @SerializedName("SourceStorageType")
    @Expose
    private String SourceStorageType;

    /**
    * Source storage address.
    */
    @SerializedName("SourceStorageAddress")
    @Expose
    private String SourceStorageAddress;

    /**
    * Source path.
    */
    @SerializedName("SourcePath")
    @Expose
    private String SourcePath;

    /**
    * Target path in the file system.
    */
    @SerializedName("TargetPath")
    @Expose
    private String TargetPath;

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
    * Data flow name, supports no more than 64 characters in length, supports chinese, numbers, _, and -.
    */
    @SerializedName("DataFlowName")
    @Expose
    private String DataFlowName;

    /**
    * 0: disable auto-update  1: enable auto-update.
    */
    @SerializedName("AutoRefresh")
    @Expose
    private Long AutoRefresh;

    /**
    * Topic Parameter used by KafkaConsumer during consumption
    */
    @SerializedName("UserKafkaTopic")
    @Expose
    private String UserKafkaTopic;

    /**
    * 	Service address example value: kafkaconsumer-ap-beijing.cls.tencentyun.com:9095.
    */
    @SerializedName("ServerAddr")
    @Expose
    private String ServerAddr;

    /**
    * Kafka consuming user name. example value: name.
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * Kafka consuming user password. default ${SecretId}#${SecretKey}.
    */
    @SerializedName("Password")
    @Expose
    private String Password;

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
     * Get Source data type; includes S3_COS, S3_L5. 
     * @return SourceStorageType Source data type; includes S3_COS, S3_L5.
     */
    public String getSourceStorageType() {
        return this.SourceStorageType;
    }

    /**
     * Set Source data type; includes S3_COS, S3_L5.
     * @param SourceStorageType Source data type; includes S3_COS, S3_L5.
     */
    public void setSourceStorageType(String SourceStorageType) {
        this.SourceStorageType = SourceStorageType;
    }

    /**
     * Get Source storage address. 
     * @return SourceStorageAddress Source storage address.
     */
    public String getSourceStorageAddress() {
        return this.SourceStorageAddress;
    }

    /**
     * Set Source storage address.
     * @param SourceStorageAddress Source storage address.
     */
    public void setSourceStorageAddress(String SourceStorageAddress) {
        this.SourceStorageAddress = SourceStorageAddress;
    }

    /**
     * Get Source path. 
     * @return SourcePath Source path.
     */
    public String getSourcePath() {
        return this.SourcePath;
    }

    /**
     * Set Source path.
     * @param SourcePath Source path.
     */
    public void setSourcePath(String SourcePath) {
        this.SourcePath = SourcePath;
    }

    /**
     * Get Target path in the file system. 
     * @return TargetPath Target path in the file system.
     */
    public String getTargetPath() {
        return this.TargetPath;
    }

    /**
     * Set Target path in the file system.
     * @param TargetPath Target path in the file system.
     */
    public void setTargetPath(String TargetPath) {
        this.TargetPath = TargetPath;
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
     * Get 0: disable auto-update  1: enable auto-update. 
     * @return AutoRefresh 0: disable auto-update  1: enable auto-update.
     */
    public Long getAutoRefresh() {
        return this.AutoRefresh;
    }

    /**
     * Set 0: disable auto-update  1: enable auto-update.
     * @param AutoRefresh 0: disable auto-update  1: enable auto-update.
     */
    public void setAutoRefresh(Long AutoRefresh) {
        this.AutoRefresh = AutoRefresh;
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
     * Get 	Service address example value: kafkaconsumer-ap-beijing.cls.tencentyun.com:9095. 
     * @return ServerAddr 	Service address example value: kafkaconsumer-ap-beijing.cls.tencentyun.com:9095.
     */
    public String getServerAddr() {
        return this.ServerAddr;
    }

    /**
     * Set 	Service address example value: kafkaconsumer-ap-beijing.cls.tencentyun.com:9095.
     * @param ServerAddr 	Service address example value: kafkaconsumer-ap-beijing.cls.tencentyun.com:9095.
     */
    public void setServerAddr(String ServerAddr) {
        this.ServerAddr = ServerAddr;
    }

    /**
     * Get Kafka consuming user name. example value: name. 
     * @return UserName Kafka consuming user name. example value: name.
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set Kafka consuming user name. example value: name.
     * @param UserName Kafka consuming user name. example value: name.
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get Kafka consuming user password. default ${SecretId}#${SecretKey}. 
     * @return Password Kafka consuming user password. default ${SecretId}#${SecretKey}.
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set Kafka consuming user password. default ${SecretId}#${SecretKey}.
     * @param Password Kafka consuming user password. default ${SecretId}#${SecretKey}.
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    public CreateDataFlowRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDataFlowRequest(CreateDataFlowRequest source) {
        if (source.FileSystemId != null) {
            this.FileSystemId = new String(source.FileSystemId);
        }
        if (source.SourceStorageType != null) {
            this.SourceStorageType = new String(source.SourceStorageType);
        }
        if (source.SourceStorageAddress != null) {
            this.SourceStorageAddress = new String(source.SourceStorageAddress);
        }
        if (source.SourcePath != null) {
            this.SourcePath = new String(source.SourcePath);
        }
        if (source.TargetPath != null) {
            this.TargetPath = new String(source.TargetPath);
        }
        if (source.SecretId != null) {
            this.SecretId = new String(source.SecretId);
        }
        if (source.SecretKey != null) {
            this.SecretKey = new String(source.SecretKey);
        }
        if (source.DataFlowName != null) {
            this.DataFlowName = new String(source.DataFlowName);
        }
        if (source.AutoRefresh != null) {
            this.AutoRefresh = new Long(source.AutoRefresh);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileSystemId", this.FileSystemId);
        this.setParamSimple(map, prefix + "SourceStorageType", this.SourceStorageType);
        this.setParamSimple(map, prefix + "SourceStorageAddress", this.SourceStorageAddress);
        this.setParamSimple(map, prefix + "SourcePath", this.SourcePath);
        this.setParamSimple(map, prefix + "TargetPath", this.TargetPath);
        this.setParamSimple(map, prefix + "SecretId", this.SecretId);
        this.setParamSimple(map, prefix + "SecretKey", this.SecretKey);
        this.setParamSimple(map, prefix + "DataFlowName", this.DataFlowName);
        this.setParamSimple(map, prefix + "AutoRefresh", this.AutoRefresh);
        this.setParamSimple(map, prefix + "UserKafkaTopic", this.UserKafkaTopic);
        this.setParamSimple(map, prefix + "ServerAddr", this.ServerAddr);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Password", this.Password);

    }
}

