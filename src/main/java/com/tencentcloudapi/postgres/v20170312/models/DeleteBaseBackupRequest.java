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

public class DeleteBaseBackupRequest extends AbstractModel {

    /**
    * Instance ID. obtain through the api [DescribeDBInstances](https://www.tencentcloud.com/document/product/409/16773?lang=en).
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * Data backup ID. obtain through the api [DescribeBaseBackups](https://www.tencentcloud.com/document/product/409/54343?lang=en). automatic backup sets cannot be deleted within 7 days.
    */
    @SerializedName("BaseBackupId")
    @Expose
    private String BaseBackupId;

    /**
     * Get Instance ID. obtain through the api [DescribeDBInstances](https://www.tencentcloud.com/document/product/409/16773?lang=en). 
     * @return DBInstanceId Instance ID. obtain through the api [DescribeDBInstances](https://www.tencentcloud.com/document/product/409/16773?lang=en).
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * Set Instance ID. obtain through the api [DescribeDBInstances](https://www.tencentcloud.com/document/product/409/16773?lang=en).
     * @param DBInstanceId Instance ID. obtain through the api [DescribeDBInstances](https://www.tencentcloud.com/document/product/409/16773?lang=en).
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * Get Data backup ID. obtain through the api [DescribeBaseBackups](https://www.tencentcloud.com/document/product/409/54343?lang=en). automatic backup sets cannot be deleted within 7 days. 
     * @return BaseBackupId Data backup ID. obtain through the api [DescribeBaseBackups](https://www.tencentcloud.com/document/product/409/54343?lang=en). automatic backup sets cannot be deleted within 7 days.
     */
    public String getBaseBackupId() {
        return this.BaseBackupId;
    }

    /**
     * Set Data backup ID. obtain through the api [DescribeBaseBackups](https://www.tencentcloud.com/document/product/409/54343?lang=en). automatic backup sets cannot be deleted within 7 days.
     * @param BaseBackupId Data backup ID. obtain through the api [DescribeBaseBackups](https://www.tencentcloud.com/document/product/409/54343?lang=en). automatic backup sets cannot be deleted within 7 days.
     */
    public void setBaseBackupId(String BaseBackupId) {
        this.BaseBackupId = BaseBackupId;
    }

    public DeleteBaseBackupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteBaseBackupRequest(DeleteBaseBackupRequest source) {
        if (source.DBInstanceId != null) {
            this.DBInstanceId = new String(source.DBInstanceId);
        }
        if (source.BaseBackupId != null) {
            this.BaseBackupId = new String(source.BaseBackupId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DBInstanceId", this.DBInstanceId);
        this.setParamSimple(map, prefix + "BaseBackupId", this.BaseBackupId);

    }
}

