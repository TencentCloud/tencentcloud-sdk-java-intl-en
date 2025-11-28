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
package com.tencentcloudapi.trocket.v20230308.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MigratingTopic extends AbstractModel {

    /**
    * Topic name
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * Migration status. 
S_RW_D_NA source cluster read/write.
S_RW_D_R specifies read and write permissions for the source cluster and read permissions for the target cluster.
S_RW_D_RW specifies read-write for the source cluster and read-write for the target cluster.
SRDRW specifies source cluster read and destination cluster read/write.
S_NA_D_RW specifies the read-write target cluster.
    */
    @SerializedName("MigrationStatus")
    @Expose
    private String MigrationStatus;

    /**
    * Specifies whether the health check is completed.	
    */
    @SerializedName("HealthCheckPassed")
    @Expose
    private Boolean HealthCheckPassed;

    /**
    * Error information returned by the last health check is valid only when HealthCheckPassed is false. NotChecked: check not executed. Unknown: Unknown error. TopicNotImported: topic not imported. TopicNotExistsInSourceCluster: topic does not exist in the source cluster. TopicNotExistsInTargetCluster: topic does not exist in the target cluster. ConsumerConnectedOnTarget: consumer connections exist on the target cluster. SourceTopicHasNewMessagesIn5Minutes: new messages were written to the source cluster topic in the last 5 Minutes. TargetTopicHasNewMessagesIn5Minutes: new messages were written to the target cluster topic in the last 5 Minutes. SourceTopicHasNoMessagesIn5Minutes: no new messages were written to the source cluster in the last 5 Minutes. TargetTopicHasNoMessagesIn5Minutes: no new messages were written to the target cluster in the last 5 Minutes. ConsumerGroupCountNotMatch: inconsistent number of subscription groups. SourceTopicHasUnconsumedMessages: unconsumed messages exist in the source cluster topic.
    */
    @SerializedName("HealthCheckError")
    @Expose
    private String HealthCheckError;

    /**
    * Namespace. specifies that it is only valid for 4.x clusters.
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * Namespace of 4.x.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NamespaceV4")
    @Expose
    private String NamespaceV4;

    /**
    * Topic name for version 4.x.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TopicNameV4")
    @Expose
    private String TopicNameV4;

    /**
    * Complete namespace for 4.x.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FullNamespaceV4")
    @Expose
    private String FullNamespaceV4;

    /**
    * Error list returned from the last health check.
    */
    @SerializedName("HealthCheckErrorList")
    @Expose
    private String [] HealthCheckErrorList;

    /**
     * Get Topic name 
     * @return TopicName Topic name
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set Topic name
     * @param TopicName Topic name
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get Migration status. 
S_RW_D_NA source cluster read/write.
S_RW_D_R specifies read and write permissions for the source cluster and read permissions for the target cluster.
S_RW_D_RW specifies read-write for the source cluster and read-write for the target cluster.
SRDRW specifies source cluster read and destination cluster read/write.
S_NA_D_RW specifies the read-write target cluster. 
     * @return MigrationStatus Migration status. 
S_RW_D_NA source cluster read/write.
S_RW_D_R specifies read and write permissions for the source cluster and read permissions for the target cluster.
S_RW_D_RW specifies read-write for the source cluster and read-write for the target cluster.
SRDRW specifies source cluster read and destination cluster read/write.
S_NA_D_RW specifies the read-write target cluster.
     */
    public String getMigrationStatus() {
        return this.MigrationStatus;
    }

    /**
     * Set Migration status. 
S_RW_D_NA source cluster read/write.
S_RW_D_R specifies read and write permissions for the source cluster and read permissions for the target cluster.
S_RW_D_RW specifies read-write for the source cluster and read-write for the target cluster.
SRDRW specifies source cluster read and destination cluster read/write.
S_NA_D_RW specifies the read-write target cluster.
     * @param MigrationStatus Migration status. 
S_RW_D_NA source cluster read/write.
S_RW_D_R specifies read and write permissions for the source cluster and read permissions for the target cluster.
S_RW_D_RW specifies read-write for the source cluster and read-write for the target cluster.
SRDRW specifies source cluster read and destination cluster read/write.
S_NA_D_RW specifies the read-write target cluster.
     */
    public void setMigrationStatus(String MigrationStatus) {
        this.MigrationStatus = MigrationStatus;
    }

    /**
     * Get Specifies whether the health check is completed.	 
     * @return HealthCheckPassed Specifies whether the health check is completed.	
     */
    public Boolean getHealthCheckPassed() {
        return this.HealthCheckPassed;
    }

    /**
     * Set Specifies whether the health check is completed.	
     * @param HealthCheckPassed Specifies whether the health check is completed.	
     */
    public void setHealthCheckPassed(Boolean HealthCheckPassed) {
        this.HealthCheckPassed = HealthCheckPassed;
    }

    /**
     * Get Error information returned by the last health check is valid only when HealthCheckPassed is false. NotChecked: check not executed. Unknown: Unknown error. TopicNotImported: topic not imported. TopicNotExistsInSourceCluster: topic does not exist in the source cluster. TopicNotExistsInTargetCluster: topic does not exist in the target cluster. ConsumerConnectedOnTarget: consumer connections exist on the target cluster. SourceTopicHasNewMessagesIn5Minutes: new messages were written to the source cluster topic in the last 5 Minutes. TargetTopicHasNewMessagesIn5Minutes: new messages were written to the target cluster topic in the last 5 Minutes. SourceTopicHasNoMessagesIn5Minutes: no new messages were written to the source cluster in the last 5 Minutes. TargetTopicHasNoMessagesIn5Minutes: no new messages were written to the target cluster in the last 5 Minutes. ConsumerGroupCountNotMatch: inconsistent number of subscription groups. SourceTopicHasUnconsumedMessages: unconsumed messages exist in the source cluster topic. 
     * @return HealthCheckError Error information returned by the last health check is valid only when HealthCheckPassed is false. NotChecked: check not executed. Unknown: Unknown error. TopicNotImported: topic not imported. TopicNotExistsInSourceCluster: topic does not exist in the source cluster. TopicNotExistsInTargetCluster: topic does not exist in the target cluster. ConsumerConnectedOnTarget: consumer connections exist on the target cluster. SourceTopicHasNewMessagesIn5Minutes: new messages were written to the source cluster topic in the last 5 Minutes. TargetTopicHasNewMessagesIn5Minutes: new messages were written to the target cluster topic in the last 5 Minutes. SourceTopicHasNoMessagesIn5Minutes: no new messages were written to the source cluster in the last 5 Minutes. TargetTopicHasNoMessagesIn5Minutes: no new messages were written to the target cluster in the last 5 Minutes. ConsumerGroupCountNotMatch: inconsistent number of subscription groups. SourceTopicHasUnconsumedMessages: unconsumed messages exist in the source cluster topic.
     */
    public String getHealthCheckError() {
        return this.HealthCheckError;
    }

    /**
     * Set Error information returned by the last health check is valid only when HealthCheckPassed is false. NotChecked: check not executed. Unknown: Unknown error. TopicNotImported: topic not imported. TopicNotExistsInSourceCluster: topic does not exist in the source cluster. TopicNotExistsInTargetCluster: topic does not exist in the target cluster. ConsumerConnectedOnTarget: consumer connections exist on the target cluster. SourceTopicHasNewMessagesIn5Minutes: new messages were written to the source cluster topic in the last 5 Minutes. TargetTopicHasNewMessagesIn5Minutes: new messages were written to the target cluster topic in the last 5 Minutes. SourceTopicHasNoMessagesIn5Minutes: no new messages were written to the source cluster in the last 5 Minutes. TargetTopicHasNoMessagesIn5Minutes: no new messages were written to the target cluster in the last 5 Minutes. ConsumerGroupCountNotMatch: inconsistent number of subscription groups. SourceTopicHasUnconsumedMessages: unconsumed messages exist in the source cluster topic.
     * @param HealthCheckError Error information returned by the last health check is valid only when HealthCheckPassed is false. NotChecked: check not executed. Unknown: Unknown error. TopicNotImported: topic not imported. TopicNotExistsInSourceCluster: topic does not exist in the source cluster. TopicNotExistsInTargetCluster: topic does not exist in the target cluster. ConsumerConnectedOnTarget: consumer connections exist on the target cluster. SourceTopicHasNewMessagesIn5Minutes: new messages were written to the source cluster topic in the last 5 Minutes. TargetTopicHasNewMessagesIn5Minutes: new messages were written to the target cluster topic in the last 5 Minutes. SourceTopicHasNoMessagesIn5Minutes: no new messages were written to the source cluster in the last 5 Minutes. TargetTopicHasNoMessagesIn5Minutes: no new messages were written to the target cluster in the last 5 Minutes. ConsumerGroupCountNotMatch: inconsistent number of subscription groups. SourceTopicHasUnconsumedMessages: unconsumed messages exist in the source cluster topic.
     */
    public void setHealthCheckError(String HealthCheckError) {
        this.HealthCheckError = HealthCheckError;
    }

    /**
     * Get Namespace. specifies that it is only valid for 4.x clusters. 
     * @return Namespace Namespace. specifies that it is only valid for 4.x clusters.
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set Namespace. specifies that it is only valid for 4.x clusters.
     * @param Namespace Namespace. specifies that it is only valid for 4.x clusters.
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get Namespace of 4.x.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return NamespaceV4 Namespace of 4.x.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getNamespaceV4() {
        return this.NamespaceV4;
    }

    /**
     * Set Namespace of 4.x.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param NamespaceV4 Namespace of 4.x.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNamespaceV4(String NamespaceV4) {
        this.NamespaceV4 = NamespaceV4;
    }

    /**
     * Get Topic name for version 4.x.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TopicNameV4 Topic name for version 4.x.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTopicNameV4() {
        return this.TopicNameV4;
    }

    /**
     * Set Topic name for version 4.x.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TopicNameV4 Topic name for version 4.x.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTopicNameV4(String TopicNameV4) {
        this.TopicNameV4 = TopicNameV4;
    }

    /**
     * Get Complete namespace for 4.x.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FullNamespaceV4 Complete namespace for 4.x.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFullNamespaceV4() {
        return this.FullNamespaceV4;
    }

    /**
     * Set Complete namespace for 4.x.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FullNamespaceV4 Complete namespace for 4.x.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFullNamespaceV4(String FullNamespaceV4) {
        this.FullNamespaceV4 = FullNamespaceV4;
    }

    /**
     * Get Error list returned from the last health check. 
     * @return HealthCheckErrorList Error list returned from the last health check.
     */
    public String [] getHealthCheckErrorList() {
        return this.HealthCheckErrorList;
    }

    /**
     * Set Error list returned from the last health check.
     * @param HealthCheckErrorList Error list returned from the last health check.
     */
    public void setHealthCheckErrorList(String [] HealthCheckErrorList) {
        this.HealthCheckErrorList = HealthCheckErrorList;
    }

    public MigratingTopic() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MigratingTopic(MigratingTopic source) {
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.MigrationStatus != null) {
            this.MigrationStatus = new String(source.MigrationStatus);
        }
        if (source.HealthCheckPassed != null) {
            this.HealthCheckPassed = new Boolean(source.HealthCheckPassed);
        }
        if (source.HealthCheckError != null) {
            this.HealthCheckError = new String(source.HealthCheckError);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.NamespaceV4 != null) {
            this.NamespaceV4 = new String(source.NamespaceV4);
        }
        if (source.TopicNameV4 != null) {
            this.TopicNameV4 = new String(source.TopicNameV4);
        }
        if (source.FullNamespaceV4 != null) {
            this.FullNamespaceV4 = new String(source.FullNamespaceV4);
        }
        if (source.HealthCheckErrorList != null) {
            this.HealthCheckErrorList = new String[source.HealthCheckErrorList.length];
            for (int i = 0; i < source.HealthCheckErrorList.length; i++) {
                this.HealthCheckErrorList[i] = new String(source.HealthCheckErrorList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "MigrationStatus", this.MigrationStatus);
        this.setParamSimple(map, prefix + "HealthCheckPassed", this.HealthCheckPassed);
        this.setParamSimple(map, prefix + "HealthCheckError", this.HealthCheckError);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "NamespaceV4", this.NamespaceV4);
        this.setParamSimple(map, prefix + "TopicNameV4", this.TopicNameV4);
        this.setParamSimple(map, prefix + "FullNamespaceV4", this.FullNamespaceV4);
        this.setParamArraySimple(map, prefix + "HealthCheckErrorList.", this.HealthCheckErrorList);

    }
}

