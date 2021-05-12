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
package com.tencentcloudapi.sms.v20190711.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteTemplateStatus extends AbstractModel{

    /**
    * Deletion status information.
    */
    @SerializedName("DeleteStatus")
    @Expose
    private String DeleteStatus;

    /**
    * Deletion time in seconds in the format of UNIX timestamp.
    */
    @SerializedName("DeleteTime")
    @Expose
    private Long DeleteTime;

    /**
     * Get Deletion status information. 
     * @return DeleteStatus Deletion status information.
     */
    public String getDeleteStatus() {
        return this.DeleteStatus;
    }

    /**
     * Set Deletion status information.
     * @param DeleteStatus Deletion status information.
     */
    public void setDeleteStatus(String DeleteStatus) {
        this.DeleteStatus = DeleteStatus;
    }

    /**
     * Get Deletion time in seconds in the format of UNIX timestamp. 
     * @return DeleteTime Deletion time in seconds in the format of UNIX timestamp.
     */
    public Long getDeleteTime() {
        return this.DeleteTime;
    }

    /**
     * Set Deletion time in seconds in the format of UNIX timestamp.
     * @param DeleteTime Deletion time in seconds in the format of UNIX timestamp.
     */
    public void setDeleteTime(Long DeleteTime) {
        this.DeleteTime = DeleteTime;
    }

    public DeleteTemplateStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteTemplateStatus(DeleteTemplateStatus source) {
        if (source.DeleteStatus != null) {
            this.DeleteStatus = new String(source.DeleteStatus);
        }
        if (source.DeleteTime != null) {
            this.DeleteTime = new Long(source.DeleteTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeleteStatus", this.DeleteStatus);
        this.setParamSimple(map, prefix + "DeleteTime", this.DeleteTime);

    }
}

