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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceUpgradeProgressItem extends AbstractModel{

    /**
    * Node instance ID
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * Task lifecycle
process: running
paused: stopped
pausing: stopping
done: completed
timeout: timed out
aborted: canceled
pending: not started
    */
    @SerializedName("LifeState")
    @Expose
    private String LifeState;

    /**
    * Upgrade start time
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("StartAt")
    @Expose
    private String StartAt;

    /**
    * Upgrade end time
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("EndAt")
    @Expose
    private String EndAt;

    /**
    * Check result before upgrading
    */
    @SerializedName("CheckResult")
    @Expose
    private InstanceUpgradePreCheckResult CheckResult;

    /**
    * Upgrade steps details
    */
    @SerializedName("Detail")
    @Expose
    private TaskStepInfo [] Detail;

    /**
     * Get Node instance ID 
     * @return InstanceID Node instance ID
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set Node instance ID
     * @param InstanceID Node instance ID
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get Task lifecycle
process: running
paused: stopped
pausing: stopping
done: completed
timeout: timed out
aborted: canceled
pending: not started 
     * @return LifeState Task lifecycle
process: running
paused: stopped
pausing: stopping
done: completed
timeout: timed out
aborted: canceled
pending: not started
     */
    public String getLifeState() {
        return this.LifeState;
    }

    /**
     * Set Task lifecycle
process: running
paused: stopped
pausing: stopping
done: completed
timeout: timed out
aborted: canceled
pending: not started
     * @param LifeState Task lifecycle
process: running
paused: stopped
pausing: stopping
done: completed
timeout: timed out
aborted: canceled
pending: not started
     */
    public void setLifeState(String LifeState) {
        this.LifeState = LifeState;
    }

    /**
     * Get Upgrade start time
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return StartAt Upgrade start time
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public String getStartAt() {
        return this.StartAt;
    }

    /**
     * Set Upgrade start time
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param StartAt Upgrade start time
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setStartAt(String StartAt) {
        this.StartAt = StartAt;
    }

    /**
     * Get Upgrade end time
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return EndAt Upgrade end time
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public String getEndAt() {
        return this.EndAt;
    }

    /**
     * Set Upgrade end time
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param EndAt Upgrade end time
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setEndAt(String EndAt) {
        this.EndAt = EndAt;
    }

    /**
     * Get Check result before upgrading 
     * @return CheckResult Check result before upgrading
     */
    public InstanceUpgradePreCheckResult getCheckResult() {
        return this.CheckResult;
    }

    /**
     * Set Check result before upgrading
     * @param CheckResult Check result before upgrading
     */
    public void setCheckResult(InstanceUpgradePreCheckResult CheckResult) {
        this.CheckResult = CheckResult;
    }

    /**
     * Get Upgrade steps details 
     * @return Detail Upgrade steps details
     */
    public TaskStepInfo [] getDetail() {
        return this.Detail;
    }

    /**
     * Set Upgrade steps details
     * @param Detail Upgrade steps details
     */
    public void setDetail(TaskStepInfo [] Detail) {
        this.Detail = Detail;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamSimple(map, prefix + "LifeState", this.LifeState);
        this.setParamSimple(map, prefix + "StartAt", this.StartAt);
        this.setParamSimple(map, prefix + "EndAt", this.EndAt);
        this.setParamObj(map, prefix + "CheckResult.", this.CheckResult);
        this.setParamArrayObj(map, prefix + "Detail.", this.Detail);

    }
}

