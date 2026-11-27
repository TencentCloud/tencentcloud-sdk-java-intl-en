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
    * <p>File system ID, which can be obtained through the API for querying file systems <a href="https://www.tencentcloud.com/document/product/582/38170?from_cn_redirect=1">DescribeCfsFileSystems</a>.</p>
    */
    @SerializedName("FileSystemId")
    @Expose
    private String FileSystemId;

    /**
    * <p>Source data type. Valid values: S3_COS and S3_L5.</p>
    */
    @SerializedName("SourceStorageType")
    @Expose
    private String SourceStorageType;

    /**
    * <p>Source storage address</p>
    */
    @SerializedName("SourceStorageAddress")
    @Expose
    private String SourceStorageAddress;

    /**
    * <p>Source path</p>
    */
    @SerializedName("SourcePath")
    @Expose
    private String SourcePath;

    /**
    * <p>Target path in the file system specified when setting data flow. It must start with /cfs/ and represents a logical path inside the file storage instance, not a local mount point path.<br>Example:</p><ul><li>If the CFS root directory / is mounted, and you need to map the source directory on object storage to test1/test2 under the mount path, the value of this parameter is /cfs/test1/test2.</li><li>If the CFS subdirectory /subdir is mounted, and you need to map the source directory on object storage to test1/test2 under the mount path, the value of this parameter is /cfs/subdir/test1/test2.</li></ul>
    */
    @SerializedName("TargetPath")
    @Expose
    private String TargetPath;

    /**
    * <p>Secret ID</p>
    */
    @SerializedName("SecretId")
    @Expose
    private String SecretId;

    /**
    * <p>Secret key</p>
    */
    @SerializedName("SecretKey")
    @Expose
    private String SecretKey;

    /**
    * <p>Data flow name. It supports up to 64 characters, including Chinese characters, digits, underscores (_), and hyphens (-).</p>
    */
    @SerializedName("DataFlowName")
    @Expose
    private String DataFlowName;

    /**
    * <p>0: Automatic update disabled. 1: Automatic update enabled.</p>
    */
    @SerializedName("AutoRefresh")
    @Expose
    private Long AutoRefresh;

    /**
    * <p>Topic parameter used by KafkaConsumer for consumption</p>
    */
    @SerializedName("UserKafkaTopic")
    @Expose
    private String UserKafkaTopic;

    /**
    * <p>Service address. Example: kafkaconsumer-ap-beijing.cls.tencentyun.com:9095</p>
    */
    @SerializedName("ServerAddr")
    @Expose
    private String ServerAddr;

    /**
    * <p>Kafka consumer username. Example: name</p>
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * <p>Kafka consumer password. Default value: ${SecretId}#${SecretKey}.</p>
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
     * Get <p>File system ID, which can be obtained through the API for querying file systems <a href="https://www.tencentcloud.com/document/product/582/38170?from_cn_redirect=1">DescribeCfsFileSystems</a>.</p> 
     * @return FileSystemId <p>File system ID, which can be obtained through the API for querying file systems <a href="https://www.tencentcloud.com/document/product/582/38170?from_cn_redirect=1">DescribeCfsFileSystems</a>.</p>
     */
    public String getFileSystemId() {
        return this.FileSystemId;
    }

    /**
     * Set <p>File system ID, which can be obtained through the API for querying file systems <a href="https://www.tencentcloud.com/document/product/582/38170?from_cn_redirect=1">DescribeCfsFileSystems</a>.</p>
     * @param FileSystemId <p>File system ID, which can be obtained through the API for querying file systems <a href="https://www.tencentcloud.com/document/product/582/38170?from_cn_redirect=1">DescribeCfsFileSystems</a>.</p>
     */
    public void setFileSystemId(String FileSystemId) {
        this.FileSystemId = FileSystemId;
    }

    /**
     * Get <p>Source data type. Valid values: S3_COS and S3_L5.</p> 
     * @return SourceStorageType <p>Source data type. Valid values: S3_COS and S3_L5.</p>
     */
    public String getSourceStorageType() {
        return this.SourceStorageType;
    }

    /**
     * Set <p>Source data type. Valid values: S3_COS and S3_L5.</p>
     * @param SourceStorageType <p>Source data type. Valid values: S3_COS and S3_L5.</p>
     */
    public void setSourceStorageType(String SourceStorageType) {
        this.SourceStorageType = SourceStorageType;
    }

    /**
     * Get <p>Source storage address</p> 
     * @return SourceStorageAddress <p>Source storage address</p>
     */
    public String getSourceStorageAddress() {
        return this.SourceStorageAddress;
    }

    /**
     * Set <p>Source storage address</p>
     * @param SourceStorageAddress <p>Source storage address</p>
     */
    public void setSourceStorageAddress(String SourceStorageAddress) {
        this.SourceStorageAddress = SourceStorageAddress;
    }

    /**
     * Get <p>Source path</p> 
     * @return SourcePath <p>Source path</p>
     */
    public String getSourcePath() {
        return this.SourcePath;
    }

    /**
     * Set <p>Source path</p>
     * @param SourcePath <p>Source path</p>
     */
    public void setSourcePath(String SourcePath) {
        this.SourcePath = SourcePath;
    }

    /**
     * Get <p>Target path in the file system specified when setting data flow. It must start with /cfs/ and represents a logical path inside the file storage instance, not a local mount point path.<br>Example:</p><ul><li>If the CFS root directory / is mounted, and you need to map the source directory on object storage to test1/test2 under the mount path, the value of this parameter is /cfs/test1/test2.</li><li>If the CFS subdirectory /subdir is mounted, and you need to map the source directory on object storage to test1/test2 under the mount path, the value of this parameter is /cfs/subdir/test1/test2.</li></ul> 
     * @return TargetPath <p>Target path in the file system specified when setting data flow. It must start with /cfs/ and represents a logical path inside the file storage instance, not a local mount point path.<br>Example:</p><ul><li>If the CFS root directory / is mounted, and you need to map the source directory on object storage to test1/test2 under the mount path, the value of this parameter is /cfs/test1/test2.</li><li>If the CFS subdirectory /subdir is mounted, and you need to map the source directory on object storage to test1/test2 under the mount path, the value of this parameter is /cfs/subdir/test1/test2.</li></ul>
     */
    public String getTargetPath() {
        return this.TargetPath;
    }

    /**
     * Set <p>Target path in the file system specified when setting data flow. It must start with /cfs/ and represents a logical path inside the file storage instance, not a local mount point path.<br>Example:</p><ul><li>If the CFS root directory / is mounted, and you need to map the source directory on object storage to test1/test2 under the mount path, the value of this parameter is /cfs/test1/test2.</li><li>If the CFS subdirectory /subdir is mounted, and you need to map the source directory on object storage to test1/test2 under the mount path, the value of this parameter is /cfs/subdir/test1/test2.</li></ul>
     * @param TargetPath <p>Target path in the file system specified when setting data flow. It must start with /cfs/ and represents a logical path inside the file storage instance, not a local mount point path.<br>Example:</p><ul><li>If the CFS root directory / is mounted, and you need to map the source directory on object storage to test1/test2 under the mount path, the value of this parameter is /cfs/test1/test2.</li><li>If the CFS subdirectory /subdir is mounted, and you need to map the source directory on object storage to test1/test2 under the mount path, the value of this parameter is /cfs/subdir/test1/test2.</li></ul>
     */
    public void setTargetPath(String TargetPath) {
        this.TargetPath = TargetPath;
    }

    /**
     * Get <p>Secret ID</p> 
     * @return SecretId <p>Secret ID</p>
     */
    public String getSecretId() {
        return this.SecretId;
    }

    /**
     * Set <p>Secret ID</p>
     * @param SecretId <p>Secret ID</p>
     */
    public void setSecretId(String SecretId) {
        this.SecretId = SecretId;
    }

    /**
     * Get <p>Secret key</p> 
     * @return SecretKey <p>Secret key</p>
     */
    public String getSecretKey() {
        return this.SecretKey;
    }

    /**
     * Set <p>Secret key</p>
     * @param SecretKey <p>Secret key</p>
     */
    public void setSecretKey(String SecretKey) {
        this.SecretKey = SecretKey;
    }

    /**
     * Get <p>Data flow name. It supports up to 64 characters, including Chinese characters, digits, underscores (_), and hyphens (-).</p> 
     * @return DataFlowName <p>Data flow name. It supports up to 64 characters, including Chinese characters, digits, underscores (_), and hyphens (-).</p>
     */
    public String getDataFlowName() {
        return this.DataFlowName;
    }

    /**
     * Set <p>Data flow name. It supports up to 64 characters, including Chinese characters, digits, underscores (_), and hyphens (-).</p>
     * @param DataFlowName <p>Data flow name. It supports up to 64 characters, including Chinese characters, digits, underscores (_), and hyphens (-).</p>
     */
    public void setDataFlowName(String DataFlowName) {
        this.DataFlowName = DataFlowName;
    }

    /**
     * Get <p>0: Automatic update disabled. 1: Automatic update enabled.</p> 
     * @return AutoRefresh <p>0: Automatic update disabled. 1: Automatic update enabled.</p>
     */
    public Long getAutoRefresh() {
        return this.AutoRefresh;
    }

    /**
     * Set <p>0: Automatic update disabled. 1: Automatic update enabled.</p>
     * @param AutoRefresh <p>0: Automatic update disabled. 1: Automatic update enabled.</p>
     */
    public void setAutoRefresh(Long AutoRefresh) {
        this.AutoRefresh = AutoRefresh;
    }

    /**
     * Get <p>Topic parameter used by KafkaConsumer for consumption</p> 
     * @return UserKafkaTopic <p>Topic parameter used by KafkaConsumer for consumption</p>
     */
    public String getUserKafkaTopic() {
        return this.UserKafkaTopic;
    }

    /**
     * Set <p>Topic parameter used by KafkaConsumer for consumption</p>
     * @param UserKafkaTopic <p>Topic parameter used by KafkaConsumer for consumption</p>
     */
    public void setUserKafkaTopic(String UserKafkaTopic) {
        this.UserKafkaTopic = UserKafkaTopic;
    }

    /**
     * Get <p>Service address. Example: kafkaconsumer-ap-beijing.cls.tencentyun.com:9095</p> 
     * @return ServerAddr <p>Service address. Example: kafkaconsumer-ap-beijing.cls.tencentyun.com:9095</p>
     */
    public String getServerAddr() {
        return this.ServerAddr;
    }

    /**
     * Set <p>Service address. Example: kafkaconsumer-ap-beijing.cls.tencentyun.com:9095</p>
     * @param ServerAddr <p>Service address. Example: kafkaconsumer-ap-beijing.cls.tencentyun.com:9095</p>
     */
    public void setServerAddr(String ServerAddr) {
        this.ServerAddr = ServerAddr;
    }

    /**
     * Get <p>Kafka consumer username. Example: name</p> 
     * @return UserName <p>Kafka consumer username. Example: name</p>
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set <p>Kafka consumer username. Example: name</p>
     * @param UserName <p>Kafka consumer username. Example: name</p>
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get <p>Kafka consumer password. Default value: ${SecretId}#${SecretKey}.</p> 
     * @return Password <p>Kafka consumer password. Default value: ${SecretId}#${SecretKey}.</p>
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set <p>Kafka consumer password. Default value: ${SecretId}#${SecretKey}.</p>
     * @param Password <p>Kafka consumer password. Default value: ${SecretId}#${SecretKey}.</p>
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

