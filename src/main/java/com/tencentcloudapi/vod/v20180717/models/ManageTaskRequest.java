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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ManageTaskRequest extends AbstractModel{

    /**
    * Video processing task ID.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Operation type. Valid value:
<li>Abort: terminate a task. You can only terminate initiated tasks in `WAITING` status.</li>
    */
    @SerializedName("OperationType")
    @Expose
    private String OperationType;

    /**
    * VOD [subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) ID. If you need to access a resource in a subapplication, enter the subapplication ID in this field; otherwise, leave it empty.
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
     * Get Video processing task ID. 
     * @return TaskId Video processing task ID.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Video processing task ID.
     * @param TaskId Video processing task ID.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Operation type. Valid value:
<li>Abort: terminate a task. You can only terminate initiated tasks in `WAITING` status.</li> 
     * @return OperationType Operation type. Valid value:
<li>Abort: terminate a task. You can only terminate initiated tasks in `WAITING` status.</li>
     */
    public String getOperationType() {
        return this.OperationType;
    }

    /**
     * Set Operation type. Valid value:
<li>Abort: terminate a task. You can only terminate initiated tasks in `WAITING` status.</li>
     * @param OperationType Operation type. Valid value:
<li>Abort: terminate a task. You can only terminate initiated tasks in `WAITING` status.</li>
     */
    public void setOperationType(String OperationType) {
        this.OperationType = OperationType;
    }

    /**
     * Get VOD [subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) ID. If you need to access a resource in a subapplication, enter the subapplication ID in this field; otherwise, leave it empty. 
     * @return SubAppId VOD [subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) ID. If you need to access a resource in a subapplication, enter the subapplication ID in this field; otherwise, leave it empty.
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set VOD [subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) ID. If you need to access a resource in a subapplication, enter the subapplication ID in this field; otherwise, leave it empty.
     * @param SubAppId VOD [subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) ID. If you need to access a resource in a subapplication, enter the subapplication ID in this field; otherwise, leave it empty.
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "OperationType", this.OperationType);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);

    }
}

