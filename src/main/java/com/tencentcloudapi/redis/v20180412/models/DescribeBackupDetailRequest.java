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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBackupDetailRequest extends AbstractModel {

    /**
    * <p>Instance ID. Log in to the <a href="https://console.cloud.tencent.com/redis/instance/list">Redis console</a> and copy it from the instance list.</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Backup ID, which can be obtained through the response parameter <strong>RedisBackupSet</strong> of the API <a href="https://www.tencentcloud.com/document/product/239/20011?from_cn_redirect=1">DescribeInstanceBackups</a>.</p>
    */
    @SerializedName("BackupId")
    @Expose
    private String BackupId;

    /**
     * Get <p>Instance ID. Log in to the <a href="https://console.cloud.tencent.com/redis/instance/list">Redis console</a> and copy it from the instance list.</p> 
     * @return InstanceId <p>Instance ID. Log in to the <a href="https://console.cloud.tencent.com/redis/instance/list">Redis console</a> and copy it from the instance list.</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Instance ID. Log in to the <a href="https://console.cloud.tencent.com/redis/instance/list">Redis console</a> and copy it from the instance list.</p>
     * @param InstanceId <p>Instance ID. Log in to the <a href="https://console.cloud.tencent.com/redis/instance/list">Redis console</a> and copy it from the instance list.</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Backup ID, which can be obtained through the response parameter <strong>RedisBackupSet</strong> of the API <a href="https://www.tencentcloud.com/document/product/239/20011?from_cn_redirect=1">DescribeInstanceBackups</a>.</p> 
     * @return BackupId <p>Backup ID, which can be obtained through the response parameter <strong>RedisBackupSet</strong> of the API <a href="https://www.tencentcloud.com/document/product/239/20011?from_cn_redirect=1">DescribeInstanceBackups</a>.</p>
     */
    public String getBackupId() {
        return this.BackupId;
    }

    /**
     * Set <p>Backup ID, which can be obtained through the response parameter <strong>RedisBackupSet</strong> of the API <a href="https://www.tencentcloud.com/document/product/239/20011?from_cn_redirect=1">DescribeInstanceBackups</a>.</p>
     * @param BackupId <p>Backup ID, which can be obtained through the response parameter <strong>RedisBackupSet</strong> of the API <a href="https://www.tencentcloud.com/document/product/239/20011?from_cn_redirect=1">DescribeInstanceBackups</a>.</p>
     */
    public void setBackupId(String BackupId) {
        this.BackupId = BackupId;
    }

    public DescribeBackupDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBackupDetailRequest(DescribeBackupDetailRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.BackupId != null) {
            this.BackupId = new String(source.BackupId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "BackupId", this.BackupId);

    }
}

