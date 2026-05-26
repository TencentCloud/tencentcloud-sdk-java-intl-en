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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteLogBackupRequest extends AbstractModel {

    /**
    * Instance ID. obtain through the api [DescribeDBInstances](https://www.tencentcloud.com/document/api/409/16773?from_cn_redirect=1).
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * Log backup ID. obtain through the api [DescribeLogBackups](https://www.tencentcloud.com/document/api/409/89021?from_cn_redirect=1). note: automatic backup sets cannot be deleted within 7 days.
    */
    @SerializedName("LogBackupId")
    @Expose
    private String LogBackupId;

    /**
     * Get Instance ID. obtain through the api [DescribeDBInstances](https://www.tencentcloud.com/document/api/409/16773?from_cn_redirect=1). 
     * @return DBInstanceId Instance ID. obtain through the api [DescribeDBInstances](https://www.tencentcloud.com/document/api/409/16773?from_cn_redirect=1).
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * Set Instance ID. obtain through the api [DescribeDBInstances](https://www.tencentcloud.com/document/api/409/16773?from_cn_redirect=1).
     * @param DBInstanceId Instance ID. obtain through the api [DescribeDBInstances](https://www.tencentcloud.com/document/api/409/16773?from_cn_redirect=1).
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * Get Log backup ID. obtain through the api [DescribeLogBackups](https://www.tencentcloud.com/document/api/409/89021?from_cn_redirect=1). note: automatic backup sets cannot be deleted within 7 days. 
     * @return LogBackupId Log backup ID. obtain through the api [DescribeLogBackups](https://www.tencentcloud.com/document/api/409/89021?from_cn_redirect=1). note: automatic backup sets cannot be deleted within 7 days.
     */
    public String getLogBackupId() {
        return this.LogBackupId;
    }

    /**
     * Set Log backup ID. obtain through the api [DescribeLogBackups](https://www.tencentcloud.com/document/api/409/89021?from_cn_redirect=1). note: automatic backup sets cannot be deleted within 7 days.
     * @param LogBackupId Log backup ID. obtain through the api [DescribeLogBackups](https://www.tencentcloud.com/document/api/409/89021?from_cn_redirect=1). note: automatic backup sets cannot be deleted within 7 days.
     */
    public void setLogBackupId(String LogBackupId) {
        this.LogBackupId = LogBackupId;
    }

    public DeleteLogBackupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteLogBackupRequest(DeleteLogBackupRequest source) {
        if (source.DBInstanceId != null) {
            this.DBInstanceId = new String(source.DBInstanceId);
        }
        if (source.LogBackupId != null) {
            this.LogBackupId = new String(source.LogBackupId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DBInstanceId", this.DBInstanceId);
        this.setParamSimple(map, prefix + "LogBackupId", this.LogBackupId);

    }
}

