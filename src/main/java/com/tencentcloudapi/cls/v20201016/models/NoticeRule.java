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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NoticeRule extends AbstractModel {

    /**
    * Match rule JSON string.
**rule tree format is a nested structure JSON string**
`{"Value":"AND","Type":"Operation","Children":[{"Value":"OR","Type":"Operation","Children":[{"Type":"Condition","Value":"Level","Children":[{"Value":"In","Type":"Compare"},{"Value":"[1,0]","Type":"Value"}]},{"Type":"Condition","Value":"Level","Children":[{"Value":"NotIn","Type":"Compare"},{"Value":"[2]","Type":"Value"}]}]}]}`

**Rule tree limiting rules are as follows**:
-Valid values for Type in the top-level rule: `Condition`, `Operation`
-Valid values for the Type of the `Operation` sub-node: `Condition`, `Operation`
-Valid values for the Type of a `Condition` sub-node: `String`, `Compare`, `Array`, `TimeRange`, `Value`, `Key`.
-Other types have no sub-node
-When rule Type is `Operation`, the valid values for value are `AND`, `OR`.
-When rule Type is `Condition`, value is required and the number of child nodes cannot be less than 2.
-When the sub-node Type is `Compare`, the valid values for value are `>`, `<`, `>=`, `<=`, `=`, `!=`, `Between`, `NotBetween`, `=~`, `!=~`, `In`, `NotIn`.
-When the value is `Between` or `NotBetween`, the next sub-node value must be an array of length 2.
-When the value is `=~` or `!=~`, the next sub-node value must be a regular expression.
-When value is `In` or `NotIn`, the next sub-node value must be an array.

**Business parameter meaning**:
-Type: Condition means the rule condition. Value: Level means the alarm level.
-Sub-node Type supports `Compare`, and Value supports `In` and `NotIn`.
-Supported values for the next sub-node value: 0 (warning), 1 (reminder), 2 (critical).
The following example means the alarm level belongs to reminder.
`{\"Value\":\"AND\",\"Type\":\"Operation\",\"Children\":[{\"Type\":\"Condition\",\"Value\":\"Level\",\"Children\":[{\"Value\":\"In\",\"Type\":\"Compare\"},{\"Value\":\"[1]\",\"Type\":\"Value\"}]}]}`

-Type: Condition means rule condition. Value: NotifyType refers to notification type.
-Sub-node Type supports `Compare`, and Value supports `In` and `NotIn`.
-Supported values for the next sub-node value: 1 (alarm notification), 2 (recovery notification).
The following example means the notification type belongs to alarm notification or the notification type is not within restoration notification.
`{\"Value\":\"AND\",\"Type\":\"Operation\",\"Children\":[{\"Value\":\"OR\",\"Type\":\"Operation\",\"Children\":[{\"Type\":\"Condition\",\"Value\":\"NotifyType\",\"Children\":[{\"Value\":\"In\",\"Type\":\"Compare\"},{\"Value\":\"[1]\",\"Type\":\"Value\"}]},{\"Type\":\"Condition\",\"Value\":\"NotifyType\",\"Children\":[{\"Value\":\"NotIn\",\"Type\":\"Compare\"},{\"Value\":\"[2]\",\"Type\":\"Value\"}]}]}]}`

-Type: Condition means rule condition. Value: AlarmID indicates alarm policy.
-Sub-node Type supports `Compare`, and Value supports `In` and `NotIn`.
-Supported values for the next sub-node value: alarm policy id array.
The following example means: The alarm policy belongs to alarm-53af048c-254b-4c73-bb48-xxx, alarm-6dfa8bc5-08da-4d64-b6cb-xxx or the alarm policy does not belong to alarm-1036314c-1e49-4cee-a8fb-xxx.
`"{\"Value\":\"AND\",\"Type\":\"Operation\",\"Children\":[{\"Value\":\"OR\",\"Type\":\"Operation\",\"Children\":[{\"Type\":\"Condition\",\"Value\":\"AlarmID\",\"Children\":[{\"Value\":\"In\",\"Type\":\"Compare\"},{\"Value\":\"[\\\"alarm-53af048c-254b-4c73-bb48-xxx\\\",\\\"alarm-6dfa8bc5-08da-4d64-b6cb-xxx\\\"]\",\"Type\":\"Value\"}]},{\"Type\":\"Condition\",\"Value\":\"AlarmID\",\"Children\":[{\"Value\":\"NotIn\",\"Type\":\"Compare\"},{\"Value\":\"[\\\"alarm-1036314c-1e49-4cee-a8fb-xxx\\\"]\",\"Type\":\"Value\"}]}]}]}"`

-Type: Condition means the rule condition. Value: AlarmName means the alarm policy name.
-Sub-node Type supports `Compare`, and Value supports `=~`, `!=~`
-Next sub-node value supported values: Must be a regular expression.
The following example means the alarm policy name regular expression matching ^test$ or the alarm policy name regular expression mismatch ^hahaha$.
`{\"Value\":\"AND\",\"Type\":\"Operation\",\"Children\":[{\"Value\":\"OR\",\"Type\":\"Operation\",\"Children\":[{\"Type\":\"Condition\",\"Value\":\"AlarmName\",\"Children\":[{\"Value\":\"=~\",\"Type\":\"Compare\"},{\"Value\":\"^test$\",\"Type\":\"Value\"}]},{\"Type\":\"Condition\",\"Value\":\"AlarmName\",\"Children\":[{\"Value\":\"!=~\",\"Type\":\"Compare\"},{\"Value\":\"^hahaha$\",\"Type\":\"Value\"}]}]}]}`

-Type: Condition means rule condition. Value: Label refers to alarm classification field.
- The sub-node Type supports `Compare`, and Value supports `In`, `NotIn`, `=~`, `!=~`.
-Supported values for the next sub-node value: `In`, `NotIn` where value is an array, `=~`, `!=~` where value is a regex.
The following example means: the alarm classification field key1 belongs to v1, or the alarm classification field key2 NOT_IN v2, or the alarm classification field key3 matches the regular expression ^test$, or the alarm classification field key4 does not match the regular expression ^hahaha$.
`{\"Value\":\"AND\",\"Type\":\"Operation\",\"Children\":[{\"Value\":\"OR\",\"Type\":\"Operation\",\"Children\":[{\"Type\":\"Condition\",\"Value\":\"Label\",\"Children\":[{\"Value\":\"key1\",\"Type\":\"Key\"},{\"Value\":\"In\",\"Type\":\"Compare\"},{\"Value\":\"[\\\"v1\\\"]\",\"Type\":\"Value\"}]},{\"Type\":\"Condition\",\"Value\":\"Label\",\"Children\":[{\"Value\":\"key2\",\"Type\":\"Key\"},{\"Value\":\"NotIn\",\"Type\":\"Compare\"},{\"Value\":\"[\\\"v2\\\"]\",\"Type\":\"Value\"}]},{\"Type\":\"Condition\",\"Value\":\"Label\",\"Children\":[{\"Value\":\"key3\",\"Type\":\"Key\"},{\"Value\":\"=~\",\"Type\":\"Compare\"},{\"Value\":\"^test$\",\"Type\":\"Value\"}]},{\"Type\":\"Condition\",\"Value\":\"Label\",\"Children\":[{\"Value\":\"key4\",\"Type\":\"Key\"},{\"Value\":\"!=~\",\"Type\":\"Compare\"},{\"Value\":\"^hahaha$\",\"Type\":\"Value\"}]}]}]}`

-Type: Condition means Rule Condition. Value: NotifyTime refers to notification time.
- Sub-node Type supports `Compare`, and Value supports `Between`, `NotBetween`
-Next sub-node value supported values: An array of strings with a length of 2 in the format `14:20:36`.
The following example indicates the notification time is within the specified scope 14:18:36 to 14:33:36 or not within specified range 14:20:36 to 14:30:36.
`{\"Value\":\"AND\",\"Type\":\"Operation\",\"Children\":[{\"Value\":\"OR\",\"Type\":\"Operation\",\"Children\":[{\"Type\":\"Condition\",\"Value\":\"NotifyTime\",\"Children\":[{\"Value\":\"Between\",\"Type\":\"Compare\"},{\"Value\":\"[\\\"14:18:36\\\",\\\"14:33:36\\\"]\",\"Type\":\"Value\"}]},{\"Type\":\"Condition\",\"Value\":\"NotifyTime\",\"Children\":[{\"Value\":\"NotBetween\",\"Type\":\"Compare\"},{\"Value\":\"[\\\"14:20:36\\\",\\\"14:30:36\\\"]\",\"Type\":\"Value\"}]}]}]}`

-Type: Condition means the rule condition. Value: Duration indicates the duration of the alarm.
-The sub-node Type supports `Compare`, and Value supports `>`, `<`, `>=`, `<=`.
-Next sub-node value supported values: integer value in minutes
The following example means: the duration of the alarm is greater than 1 minute, equal to or greater than 2 minutes, less than 3 minutes, or less than or equal to 4 minutes.
`{\"Value\":\"AND\",\"Type\":\"Operation\",\"Children\":[{\"Value\":\"OR\",\"Type\":\"Operation\",\"Children\":[{\"Type\":\"Condition\",\"Value\":\"Duration\",\"Children\":[{\"Value\":\">\",\"Type\":\"Compare\"},{\"Value\":1,\"Type\":\"Value\"}]},{\"Type\":\"Condition\",\"Value\":\"Duration\",\"Children\":[{\"Value\":\">=\",\"Type\":\"Compare\"},{\"Value\":2,\"Type\":\"Value\"}]},{\"Type\":\"Condition\",\"Value\":\"Duration\",\"Children\":[{\"Value\":\"<\",\"Type\":\"Compare\"},{\"Value\":3,\"Type\":\"Value\"}]},{\"Type\":\"Condition\",\"Value\":\"Duration\",\"Children\":[{\"Value\":\"<=\",\"Type\":\"Compare\"},{\"Value\":4,\"Type\":\"Value\"}]}]}]}`
    */
    @SerializedName("Rule")
    @Expose
    private String Rule;

    /**
    * Alarm notification recipient information.
    */
    @SerializedName("NoticeReceivers")
    @Expose
    private NoticeReceiver [] NoticeReceivers;

    /**
    * Alarm notification template callback information, including WeCom, DingTalk, and Lark.
    */
    @SerializedName("WebCallbacks")
    @Expose
    private WebCallback [] WebCallbacks;

    /**
    * Alarm escalation switch. `true`: enable alarm escalation, `false`: disable alarm escalation. Default: false.
    */
    @SerializedName("Escalate")
    @Expose
    private Boolean Escalate;

    /**
    * Alarm escalation conditions. `1`: Unclaimed and unrecovered, `2`: Unrecovered. Default is 1.
-Unclaimed and unrecovered: Upgrade if the alert is not restored and no one claims it.
-Unrecovered: Upgrade if the alarm persists without recovery.

    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * Escalate alarms interval. Unit: minutes, range `[1, 14400]`.
    */
    @SerializedName("Interval")
    @Expose
    private Long Interval;

    /**
    * Notification channel configuration for the next step after alarm severity escalation.
    */
    @SerializedName("EscalateNotice")
    @Expose
    private EscalateNoticeInfo EscalateNotice;

    /**
     * Get Match rule JSON string.
**rule tree format is a nested structure JSON string**
`{"Value":"AND","Type":"Operation","Children":[{"Value":"OR","Type":"Operation","Children":[{"Type":"Condition","Value":"Level","Children":[{"Value":"In","Type":"Compare"},{"Value":"[1,0]","Type":"Value"}]},{"Type":"Condition","Value":"Level","Children":[{"Value":"NotIn","Type":"Compare"},{"Value":"[2]","Type":"Value"}]}]}]}`

**Rule tree limiting rules are as follows**:
-Valid values for Type in the top-level rule: `Condition`, `Operation`
-Valid values for the Type of the `Operation` sub-node: `Condition`, `Operation`
-Valid values for the Type of a `Condition` sub-node: `String`, `Compare`, `Array`, `TimeRange`, `Value`, `Key`.
-Other types have no sub-node
-When rule Type is `Operation`, the valid values for value are `AND`, `OR`.
-When rule Type is `Condition`, value is required and the number of child nodes cannot be less than 2.
-When the sub-node Type is `Compare`, the valid values for value are `>`, `<`, `>=`, `<=`, `=`, `!=`, `Between`, `NotBetween`, `=~`, `!=~`, `In`, `NotIn`.
-When the value is `Between` or `NotBetween`, the next sub-node value must be an array of length 2.
-When the value is `=~` or `!=~`, the next sub-node value must be a regular expression.
-When value is `In` or `NotIn`, the next sub-node value must be an array.

**Business parameter meaning**:
-Type: Condition means the rule condition. Value: Level means the alarm level.
-Sub-node Type supports `Compare`, and Value supports `In` and `NotIn`.
-Supported values for the next sub-node value: 0 (warning), 1 (reminder), 2 (critical).
The following example means the alarm level belongs to reminder.
`{\"Value\":\"AND\",\"Type\":\"Operation\",\"Children\":[{\"Type\":\"Condition\",\"Value\":\"Level\",\"Children\":[{\"Value\":\"In\",\"Type\":\"Compare\"},{\"Value\":\"[1]\",\"Type\":\"Value\"}]}]}`

-Type: Condition means rule condition. Value: NotifyType refers to notification type.
-Sub-node Type supports `Compare`, and Value supports `In` and `NotIn`.
-Supported values for the next sub-node value: 1 (alarm notification), 2 (recovery notification).
The following example means the notification type belongs to alarm notification or the notification type is not within restoration notification.
`{\"Value\":\"AND\",\"Type\":\"Operation\",\"Children\":[{\"Value\":\"OR\",\"Type\":\"Operation\",\"Children\":[{\"Type\":\"Condition\",\"Value\":\"NotifyType\",\"Children\":[{\"Value\":\"In\",\"Type\":\"Compare\"},{\"Value\":\"[1]\",\"Type\":\"Value\"}]},{\"Type\":\"Condition\",\"Value\":\"NotifyType\",\"Children\":[{\"Value\":\"NotIn\",\"Type\":\"Compare\"},{\"Value\":\"[2]\",\"Type\":\"Value\"}]}]}]}`

-Type: Condition means rule condition. Value: AlarmID indicates alarm policy.
-Sub-node Type supports `Compare`, and Value supports `In` and `NotIn`.
-Supported values for the next sub-node value: alarm policy id array.
The following example means: The alarm policy belongs to alarm-53af048c-254b-4c73-bb48-xxx, alarm-6dfa8bc5-08da-4d64-b6cb-xxx or the alarm policy does not belong to alarm-1036314c-1e49-4cee-a8fb-xxx.
`"{\"Value\":\"AND\",\"Type\":\"Operation\",\"Children\":[{\"Value\":\"OR\",\"Type\":\"Operation\",\"Children\":[{\"Type\":\"Condition\",\"Value\":\"AlarmID\",\"Children\":[{\"Value\":\"In\",\"Type\":\"Compare\"},{\"Value\":\"[\\\"alarm-53af048c-254b-4c73-bb48-xxx\\\",\\\"alarm-6dfa8bc5-08da-4d64-b6cb-xxx\\\"]\",\"Type\":\"Value\"}]},{\"Type\":\"Condition\",\"Value\":\"AlarmID\",\"Children\":[{\"Value\":\"NotIn\",\"Type\":\"Compare\"},{\"Value\":\"[\\\"alarm-1036314c-1e49-4cee-a8fb-xxx\\\"]\",\"Type\":\"Value\"}]}]}]}"`

-Type: Condition means the rule condition. Value: AlarmName means the alarm policy name.
-Sub-node Type supports `Compare`, and Value supports `=~`, `!=~`
-Next sub-node value supported values: Must be a regular expression.
The following example means the alarm policy name regular expression matching ^test$ or the alarm policy name regular expression mismatch ^hahaha$.
`{\"Value\":\"AND\",\"Type\":\"Operation\",\"Children\":[{\"Value\":\"OR\",\"Type\":\"Operation\",\"Children\":[{\"Type\":\"Condition\",\"Value\":\"AlarmName\",\"Children\":[{\"Value\":\"=~\",\"Type\":\"Compare\"},{\"Value\":\"^test$\",\"Type\":\"Value\"}]},{\"Type\":\"Condition\",\"Value\":\"AlarmName\",\"Children\":[{\"Value\":\"!=~\",\"Type\":\"Compare\"},{\"Value\":\"^hahaha$\",\"Type\":\"Value\"}]}]}]}`

-Type: Condition means rule condition. Value: Label refers to alarm classification field.
- The sub-node Type supports `Compare`, and Value supports `In`, `NotIn`, `=~`, `!=~`.
-Supported values for the next sub-node value: `In`, `NotIn` where value is an array, `=~`, `!=~` where value is a regex.
The following example means: the alarm classification field key1 belongs to v1, or the alarm classification field key2 NOT_IN v2, or the alarm classification field key3 matches the regular expression ^test$, or the alarm classification field key4 does not match the regular expression ^hahaha$.
`{\"Value\":\"AND\",\"Type\":\"Operation\",\"Children\":[{\"Value\":\"OR\",\"Type\":\"Operation\",\"Children\":[{\"Type\":\"Condition\",\"Value\":\"Label\",\"Children\":[{\"Value\":\"key1\",\"Type\":\"Key\"},{\"Value\":\"In\",\"Type\":\"Compare\"},{\"Value\":\"[\\\"v1\\\"]\",\"Type\":\"Value\"}]},{\"Type\":\"Condition\",\"Value\":\"Label\",\"Children\":[{\"Value\":\"key2\",\"Type\":\"Key\"},{\"Value\":\"NotIn\",\"Type\":\"Compare\"},{\"Value\":\"[\\\"v2\\\"]\",\"Type\":\"Value\"}]},{\"Type\":\"Condition\",\"Value\":\"Label\",\"Children\":[{\"Value\":\"key3\",\"Type\":\"Key\"},{\"Value\":\"=~\",\"Type\":\"Compare\"},{\"Value\":\"^test$\",\"Type\":\"Value\"}]},{\"Type\":\"Condition\",\"Value\":\"Label\",\"Children\":[{\"Value\":\"key4\",\"Type\":\"Key\"},{\"Value\":\"!=~\",\"Type\":\"Compare\"},{\"Value\":\"^hahaha$\",\"Type\":\"Value\"}]}]}]}`

-Type: Condition means Rule Condition. Value: NotifyTime refers to notification time.
- Sub-node Type supports `Compare`, and Value supports `Between`, `NotBetween`
-Next sub-node value supported values: An array of strings with a length of 2 in the format `14:20:36`.
The following example indicates the notification time is within the specified scope 14:18:36 to 14:33:36 or not within specified range 14:20:36 to 14:30:36.
`{\"Value\":\"AND\",\"Type\":\"Operation\",\"Children\":[{\"Value\":\"OR\",\"Type\":\"Operation\",\"Children\":[{\"Type\":\"Condition\",\"Value\":\"NotifyTime\",\"Children\":[{\"Value\":\"Between\",\"Type\":\"Compare\"},{\"Value\":\"[\\\"14:18:36\\\",\\\"14:33:36\\\"]\",\"Type\":\"Value\"}]},{\"Type\":\"Condition\",\"Value\":\"NotifyTime\",\"Children\":[{\"Value\":\"NotBetween\",\"Type\":\"Compare\"},{\"Value\":\"[\\\"14:20:36\\\",\\\"14:30:36\\\"]\",\"Type\":\"Value\"}]}]}]}`

-Type: Condition means the rule condition. Value: Duration indicates the duration of the alarm.
-The sub-node Type supports `Compare`, and Value supports `>`, `<`, `>=`, `<=`.
-Next sub-node value supported values: integer value in minutes
The following example means: the duration of the alarm is greater than 1 minute, equal to or greater than 2 minutes, less than 3 minutes, or less than or equal to 4 minutes.
`{\"Value\":\"AND\",\"Type\":\"Operation\",\"Children\":[{\"Value\":\"OR\",\"Type\":\"Operation\",\"Children\":[{\"Type\":\"Condition\",\"Value\":\"Duration\",\"Children\":[{\"Value\":\">\",\"Type\":\"Compare\"},{\"Value\":1,\"Type\":\"Value\"}]},{\"Type\":\"Condition\",\"Value\":\"Duration\",\"Children\":[{\"Value\":\">=\",\"Type\":\"Compare\"},{\"Value\":2,\"Type\":\"Value\"}]},{\"Type\":\"Condition\",\"Value\":\"Duration\",\"Children\":[{\"Value\":\"<\",\"Type\":\"Compare\"},{\"Value\":3,\"Type\":\"Value\"}]},{\"Type\":\"Condition\",\"Value\":\"Duration\",\"Children\":[{\"Value\":\"<=\",\"Type\":\"Compare\"},{\"Value\":4,\"Type\":\"Value\"}]}]}]}` 
     * @return Rule Match rule JSON string.
**rule tree format is a nested structure JSON string**
`{"Value":"AND","Type":"Operation","Children":[{"Value":"OR","Type":"Operation","Children":[{"Type":"Condition","Value":"Level","Children":[{"Value":"In","Type":"Compare"},{"Value":"[1,0]","Type":"Value"}]},{"Type":"Condition","Value":"Level","Children":[{"Value":"NotIn","Type":"Compare"},{"Value":"[2]","Type":"Value"}]}]}]}`

**Rule tree limiting rules are as follows**:
-Valid values for Type in the top-level rule: `Condition`, `Operation`
-Valid values for the Type of the `Operation` sub-node: `Condition`, `Operation`
-Valid values for the Type of a `Condition` sub-node: `String`, `Compare`, `Array`, `TimeRange`, `Value`, `Key`.
-Other types have no sub-node
-When rule Type is `Operation`, the valid values for value are `AND`, `OR`.
-When rule Type is `Condition`, value is required and the number of child nodes cannot be less than 2.
-When the sub-node Type is `Compare`, the valid values for value are `>`, `<`, `>=`, `<=`, `=`, `!=`, `Between`, `NotBetween`, `=~`, `!=~`, `In`, `NotIn`.
-When the value is `Between` or `NotBetween`, the next sub-node value must be an array of length 2.
-When the value is `=~` or `!=~`, the next sub-node value must be a regular expression.
-When value is `In` or `NotIn`, the next sub-node value must be an array.

**Business parameter meaning**:
-Type: Condition means the rule condition. Value: Level means the alarm level.
-Sub-node Type supports `Compare`, and Value supports `In` and `NotIn`.
-Supported values for the next sub-node value: 0 (warning), 1 (reminder), 2 (critical).
The following example means the alarm level belongs to reminder.
`{\"Value\":\"AND\",\"Type\":\"Operation\",\"Children\":[{\"Type\":\"Condition\",\"Value\":\"Level\",\"Children\":[{\"Value\":\"In\",\"Type\":\"Compare\"},{\"Value\":\"[1]\",\"Type\":\"Value\"}]}]}`

-Type: Condition means rule condition. Value: NotifyType refers to notification type.
-Sub-node Type supports `Compare`, and Value supports `In` and `NotIn`.
-Supported values for the next sub-node value: 1 (alarm notification), 2 (recovery notification).
The following example means the notification type belongs to alarm notification or the notification type is not within restoration notification.
`{\"Value\":\"AND\",\"Type\":\"Operation\",\"Children\":[{\"Value\":\"OR\",\"Type\":\"Operation\",\"Children\":[{\"Type\":\"Condition\",\"Value\":\"NotifyType\",\"Children\":[{\"Value\":\"In\",\"Type\":\"Compare\"},{\"Value\":\"[1]\",\"Type\":\"Value\"}]},{\"Type\":\"Condition\",\"Value\":\"NotifyType\",\"Children\":[{\"Value\":\"NotIn\",\"Type\":\"Compare\"},{\"Value\":\"[2]\",\"Type\":\"Value\"}]}]}]}`

-Type: Condition means rule condition. Value: AlarmID indicates alarm policy.
-Sub-node Type supports `Compare`, and Value supports `In` and `NotIn`.
-Supported values for the next sub-node value: alarm policy id array.
The following example means: The alarm policy belongs to alarm-53af048c-254b-4c73-bb48-xxx, alarm-6dfa8bc5-08da-4d64-b6cb-xxx or the alarm policy does not belong to alarm-1036314c-1e49-4cee-a8fb-xxx.
`"{\"Value\":\"AND\",\"Type\":\"Operation\",\"Children\":[{\"Value\":\"OR\",\"Type\":\"Operation\",\"Children\":[{\"Type\":\"Condition\",\"Value\":\"AlarmID\",\"Children\":[{\"Value\":\"In\",\"Type\":\"Compare\"},{\"Value\":\"[\\\"alarm-53af048c-254b-4c73-bb48-xxx\\\",\\\"alarm-6dfa8bc5-08da-4d64-b6cb-xxx\\\"]\",\"Type\":\"Value\"}]},{\"Type\":\"Condition\",\"Value\":\"AlarmID\",\"Children\":[{\"Value\":\"NotIn\",\"Type\":\"Compare\"},{\"Value\":\"[\\\"alarm-1036314c-1e49-4cee-a8fb-xxx\\\"]\",\"Type\":\"Value\"}]}]}]}"`

-Type: Condition means the rule condition. Value: AlarmName means the alarm policy name.
-Sub-node Type supports `Compare`, and Value supports `=~`, `!=~`
-Next sub-node value supported values: Must be a regular expression.
The following example means the alarm policy name regular expression matching ^test$ or the alarm policy name regular expression mismatch ^hahaha$.
`{\"Value\":\"AND\",\"Type\":\"Operation\",\"Children\":[{\"Value\":\"OR\",\"Type\":\"Operation\",\"Children\":[{\"Type\":\"Condition\",\"Value\":\"AlarmName\",\"Children\":[{\"Value\":\"=~\",\"Type\":\"Compare\"},{\"Value\":\"^test$\",\"Type\":\"Value\"}]},{\"Type\":\"Condition\",\"Value\":\"AlarmName\",\"Children\":[{\"Value\":\"!=~\",\"Type\":\"Compare\"},{\"Value\":\"^hahaha$\",\"Type\":\"Value\"}]}]}]}`

-Type: Condition means rule condition. Value: Label refers to alarm classification field.
- The sub-node Type supports `Compare`, and Value supports `In`, `NotIn`, `=~`, `!=~`.
-Supported values for the next sub-node value: `In`, `NotIn` where value is an array, `=~`, `!=~` where value is a regex.
The following example means: the alarm classification field key1 belongs to v1, or the alarm classification field key2 NOT_IN v2, or the alarm classification field key3 matches the regular expression ^test$, or the alarm classification field key4 does not match the regular expression ^hahaha$.
`{\"Value\":\"AND\",\"Type\":\"Operation\",\"Children\":[{\"Value\":\"OR\",\"Type\":\"Operation\",\"Children\":[{\"Type\":\"Condition\",\"Value\":\"Label\",\"Children\":[{\"Value\":\"key1\",\"Type\":\"Key\"},{\"Value\":\"In\",\"Type\":\"Compare\"},{\"Value\":\"[\\\"v1\\\"]\",\"Type\":\"Value\"}]},{\"Type\":\"Condition\",\"Value\":\"Label\",\"Children\":[{\"Value\":\"key2\",\"Type\":\"Key\"},{\"Value\":\"NotIn\",\"Type\":\"Compare\"},{\"Value\":\"[\\\"v2\\\"]\",\"Type\":\"Value\"}]},{\"Type\":\"Condition\",\"Value\":\"Label\",\"Children\":[{\"Value\":\"key3\",\"Type\":\"Key\"},{\"Value\":\"=~\",\"Type\":\"Compare\"},{\"Value\":\"^test$\",\"Type\":\"Value\"}]},{\"Type\":\"Condition\",\"Value\":\"Label\",\"Children\":[{\"Value\":\"key4\",\"Type\":\"Key\"},{\"Value\":\"!=~\",\"Type\":\"Compare\"},{\"Value\":\"^hahaha$\",\"Type\":\"Value\"}]}]}]}`

-Type: Condition means Rule Condition. Value: NotifyTime refers to notification time.
- Sub-node Type supports `Compare`, and Value supports `Between`, `NotBetween`
-Next sub-node value supported values: An array of strings with a length of 2 in the format `14:20:36`.
The following example indicates the notification time is within the specified scope 14:18:36 to 14:33:36 or not within specified range 14:20:36 to 14:30:36.
`{\"Value\":\"AND\",\"Type\":\"Operation\",\"Children\":[{\"Value\":\"OR\",\"Type\":\"Operation\",\"Children\":[{\"Type\":\"Condition\",\"Value\":\"NotifyTime\",\"Children\":[{\"Value\":\"Between\",\"Type\":\"Compare\"},{\"Value\":\"[\\\"14:18:36\\\",\\\"14:33:36\\\"]\",\"Type\":\"Value\"}]},{\"Type\":\"Condition\",\"Value\":\"NotifyTime\",\"Children\":[{\"Value\":\"NotBetween\",\"Type\":\"Compare\"},{\"Value\":\"[\\\"14:20:36\\\",\\\"14:30:36\\\"]\",\"Type\":\"Value\"}]}]}]}`

-Type: Condition means the rule condition. Value: Duration indicates the duration of the alarm.
-The sub-node Type supports `Compare`, and Value supports `>`, `<`, `>=`, `<=`.
-Next sub-node value supported values: integer value in minutes
The following example means: the duration of the alarm is greater than 1 minute, equal to or greater than 2 minutes, less than 3 minutes, or less than or equal to 4 minutes.
`{\"Value\":\"AND\",\"Type\":\"Operation\",\"Children\":[{\"Value\":\"OR\",\"Type\":\"Operation\",\"Children\":[{\"Type\":\"Condition\",\"Value\":\"Duration\",\"Children\":[{\"Value\":\">\",\"Type\":\"Compare\"},{\"Value\":1,\"Type\":\"Value\"}]},{\"Type\":\"Condition\",\"Value\":\"Duration\",\"Children\":[{\"Value\":\">=\",\"Type\":\"Compare\"},{\"Value\":2,\"Type\":\"Value\"}]},{\"Type\":\"Condition\",\"Value\":\"Duration\",\"Children\":[{\"Value\":\"<\",\"Type\":\"Compare\"},{\"Value\":3,\"Type\":\"Value\"}]},{\"Type\":\"Condition\",\"Value\":\"Duration\",\"Children\":[{\"Value\":\"<=\",\"Type\":\"Compare\"},{\"Value\":4,\"Type\":\"Value\"}]}]}]}`
     */
    public String getRule() {
        return this.Rule;
    }

    /**
     * Set Match rule JSON string.
**rule tree format is a nested structure JSON string**
`{"Value":"AND","Type":"Operation","Children":[{"Value":"OR","Type":"Operation","Children":[{"Type":"Condition","Value":"Level","Children":[{"Value":"In","Type":"Compare"},{"Value":"[1,0]","Type":"Value"}]},{"Type":"Condition","Value":"Level","Children":[{"Value":"NotIn","Type":"Compare"},{"Value":"[2]","Type":"Value"}]}]}]}`

**Rule tree limiting rules are as follows**:
-Valid values for Type in the top-level rule: `Condition`, `Operation`
-Valid values for the Type of the `Operation` sub-node: `Condition`, `Operation`
-Valid values for the Type of a `Condition` sub-node: `String`, `Compare`, `Array`, `TimeRange`, `Value`, `Key`.
-Other types have no sub-node
-When rule Type is `Operation`, the valid values for value are `AND`, `OR`.
-When rule Type is `Condition`, value is required and the number of child nodes cannot be less than 2.
-When the sub-node Type is `Compare`, the valid values for value are `>`, `<`, `>=`, `<=`, `=`, `!=`, `Between`, `NotBetween`, `=~`, `!=~`, `In`, `NotIn`.
-When the value is `Between` or `NotBetween`, the next sub-node value must be an array of length 2.
-When the value is `=~` or `!=~`, the next sub-node value must be a regular expression.
-When value is `In` or `NotIn`, the next sub-node value must be an array.

**Business parameter meaning**:
-Type: Condition means the rule condition. Value: Level means the alarm level.
-Sub-node Type supports `Compare`, and Value supports `In` and `NotIn`.
-Supported values for the next sub-node value: 0 (warning), 1 (reminder), 2 (critical).
The following example means the alarm level belongs to reminder.
`{\"Value\":\"AND\",\"Type\":\"Operation\",\"Children\":[{\"Type\":\"Condition\",\"Value\":\"Level\",\"Children\":[{\"Value\":\"In\",\"Type\":\"Compare\"},{\"Value\":\"[1]\",\"Type\":\"Value\"}]}]}`

-Type: Condition means rule condition. Value: NotifyType refers to notification type.
-Sub-node Type supports `Compare`, and Value supports `In` and `NotIn`.
-Supported values for the next sub-node value: 1 (alarm notification), 2 (recovery notification).
The following example means the notification type belongs to alarm notification or the notification type is not within restoration notification.
`{\"Value\":\"AND\",\"Type\":\"Operation\",\"Children\":[{\"Value\":\"OR\",\"Type\":\"Operation\",\"Children\":[{\"Type\":\"Condition\",\"Value\":\"NotifyType\",\"Children\":[{\"Value\":\"In\",\"Type\":\"Compare\"},{\"Value\":\"[1]\",\"Type\":\"Value\"}]},{\"Type\":\"Condition\",\"Value\":\"NotifyType\",\"Children\":[{\"Value\":\"NotIn\",\"Type\":\"Compare\"},{\"Value\":\"[2]\",\"Type\":\"Value\"}]}]}]}`

-Type: Condition means rule condition. Value: AlarmID indicates alarm policy.
-Sub-node Type supports `Compare`, and Value supports `In` and `NotIn`.
-Supported values for the next sub-node value: alarm policy id array.
The following example means: The alarm policy belongs to alarm-53af048c-254b-4c73-bb48-xxx, alarm-6dfa8bc5-08da-4d64-b6cb-xxx or the alarm policy does not belong to alarm-1036314c-1e49-4cee-a8fb-xxx.
`"{\"Value\":\"AND\",\"Type\":\"Operation\",\"Children\":[{\"Value\":\"OR\",\"Type\":\"Operation\",\"Children\":[{\"Type\":\"Condition\",\"Value\":\"AlarmID\",\"Children\":[{\"Value\":\"In\",\"Type\":\"Compare\"},{\"Value\":\"[\\\"alarm-53af048c-254b-4c73-bb48-xxx\\\",\\\"alarm-6dfa8bc5-08da-4d64-b6cb-xxx\\\"]\",\"Type\":\"Value\"}]},{\"Type\":\"Condition\",\"Value\":\"AlarmID\",\"Children\":[{\"Value\":\"NotIn\",\"Type\":\"Compare\"},{\"Value\":\"[\\\"alarm-1036314c-1e49-4cee-a8fb-xxx\\\"]\",\"Type\":\"Value\"}]}]}]}"`

-Type: Condition means the rule condition. Value: AlarmName means the alarm policy name.
-Sub-node Type supports `Compare`, and Value supports `=~`, `!=~`
-Next sub-node value supported values: Must be a regular expression.
The following example means the alarm policy name regular expression matching ^test$ or the alarm policy name regular expression mismatch ^hahaha$.
`{\"Value\":\"AND\",\"Type\":\"Operation\",\"Children\":[{\"Value\":\"OR\",\"Type\":\"Operation\",\"Children\":[{\"Type\":\"Condition\",\"Value\":\"AlarmName\",\"Children\":[{\"Value\":\"=~\",\"Type\":\"Compare\"},{\"Value\":\"^test$\",\"Type\":\"Value\"}]},{\"Type\":\"Condition\",\"Value\":\"AlarmName\",\"Children\":[{\"Value\":\"!=~\",\"Type\":\"Compare\"},{\"Value\":\"^hahaha$\",\"Type\":\"Value\"}]}]}]}`

-Type: Condition means rule condition. Value: Label refers to alarm classification field.
- The sub-node Type supports `Compare`, and Value supports `In`, `NotIn`, `=~`, `!=~`.
-Supported values for the next sub-node value: `In`, `NotIn` where value is an array, `=~`, `!=~` where value is a regex.
The following example means: the alarm classification field key1 belongs to v1, or the alarm classification field key2 NOT_IN v2, or the alarm classification field key3 matches the regular expression ^test$, or the alarm classification field key4 does not match the regular expression ^hahaha$.
`{\"Value\":\"AND\",\"Type\":\"Operation\",\"Children\":[{\"Value\":\"OR\",\"Type\":\"Operation\",\"Children\":[{\"Type\":\"Condition\",\"Value\":\"Label\",\"Children\":[{\"Value\":\"key1\",\"Type\":\"Key\"},{\"Value\":\"In\",\"Type\":\"Compare\"},{\"Value\":\"[\\\"v1\\\"]\",\"Type\":\"Value\"}]},{\"Type\":\"Condition\",\"Value\":\"Label\",\"Children\":[{\"Value\":\"key2\",\"Type\":\"Key\"},{\"Value\":\"NotIn\",\"Type\":\"Compare\"},{\"Value\":\"[\\\"v2\\\"]\",\"Type\":\"Value\"}]},{\"Type\":\"Condition\",\"Value\":\"Label\",\"Children\":[{\"Value\":\"key3\",\"Type\":\"Key\"},{\"Value\":\"=~\",\"Type\":\"Compare\"},{\"Value\":\"^test$\",\"Type\":\"Value\"}]},{\"Type\":\"Condition\",\"Value\":\"Label\",\"Children\":[{\"Value\":\"key4\",\"Type\":\"Key\"},{\"Value\":\"!=~\",\"Type\":\"Compare\"},{\"Value\":\"^hahaha$\",\"Type\":\"Value\"}]}]}]}`

-Type: Condition means Rule Condition. Value: NotifyTime refers to notification time.
- Sub-node Type supports `Compare`, and Value supports `Between`, `NotBetween`
-Next sub-node value supported values: An array of strings with a length of 2 in the format `14:20:36`.
The following example indicates the notification time is within the specified scope 14:18:36 to 14:33:36 or not within specified range 14:20:36 to 14:30:36.
`{\"Value\":\"AND\",\"Type\":\"Operation\",\"Children\":[{\"Value\":\"OR\",\"Type\":\"Operation\",\"Children\":[{\"Type\":\"Condition\",\"Value\":\"NotifyTime\",\"Children\":[{\"Value\":\"Between\",\"Type\":\"Compare\"},{\"Value\":\"[\\\"14:18:36\\\",\\\"14:33:36\\\"]\",\"Type\":\"Value\"}]},{\"Type\":\"Condition\",\"Value\":\"NotifyTime\",\"Children\":[{\"Value\":\"NotBetween\",\"Type\":\"Compare\"},{\"Value\":\"[\\\"14:20:36\\\",\\\"14:30:36\\\"]\",\"Type\":\"Value\"}]}]}]}`

-Type: Condition means the rule condition. Value: Duration indicates the duration of the alarm.
-The sub-node Type supports `Compare`, and Value supports `>`, `<`, `>=`, `<=`.
-Next sub-node value supported values: integer value in minutes
The following example means: the duration of the alarm is greater than 1 minute, equal to or greater than 2 minutes, less than 3 minutes, or less than or equal to 4 minutes.
`{\"Value\":\"AND\",\"Type\":\"Operation\",\"Children\":[{\"Value\":\"OR\",\"Type\":\"Operation\",\"Children\":[{\"Type\":\"Condition\",\"Value\":\"Duration\",\"Children\":[{\"Value\":\">\",\"Type\":\"Compare\"},{\"Value\":1,\"Type\":\"Value\"}]},{\"Type\":\"Condition\",\"Value\":\"Duration\",\"Children\":[{\"Value\":\">=\",\"Type\":\"Compare\"},{\"Value\":2,\"Type\":\"Value\"}]},{\"Type\":\"Condition\",\"Value\":\"Duration\",\"Children\":[{\"Value\":\"<\",\"Type\":\"Compare\"},{\"Value\":3,\"Type\":\"Value\"}]},{\"Type\":\"Condition\",\"Value\":\"Duration\",\"Children\":[{\"Value\":\"<=\",\"Type\":\"Compare\"},{\"Value\":4,\"Type\":\"Value\"}]}]}]}`
     * @param Rule Match rule JSON string.
**rule tree format is a nested structure JSON string**
`{"Value":"AND","Type":"Operation","Children":[{"Value":"OR","Type":"Operation","Children":[{"Type":"Condition","Value":"Level","Children":[{"Value":"In","Type":"Compare"},{"Value":"[1,0]","Type":"Value"}]},{"Type":"Condition","Value":"Level","Children":[{"Value":"NotIn","Type":"Compare"},{"Value":"[2]","Type":"Value"}]}]}]}`

**Rule tree limiting rules are as follows**:
-Valid values for Type in the top-level rule: `Condition`, `Operation`
-Valid values for the Type of the `Operation` sub-node: `Condition`, `Operation`
-Valid values for the Type of a `Condition` sub-node: `String`, `Compare`, `Array`, `TimeRange`, `Value`, `Key`.
-Other types have no sub-node
-When rule Type is `Operation`, the valid values for value are `AND`, `OR`.
-When rule Type is `Condition`, value is required and the number of child nodes cannot be less than 2.
-When the sub-node Type is `Compare`, the valid values for value are `>`, `<`, `>=`, `<=`, `=`, `!=`, `Between`, `NotBetween`, `=~`, `!=~`, `In`, `NotIn`.
-When the value is `Between` or `NotBetween`, the next sub-node value must be an array of length 2.
-When the value is `=~` or `!=~`, the next sub-node value must be a regular expression.
-When value is `In` or `NotIn`, the next sub-node value must be an array.

**Business parameter meaning**:
-Type: Condition means the rule condition. Value: Level means the alarm level.
-Sub-node Type supports `Compare`, and Value supports `In` and `NotIn`.
-Supported values for the next sub-node value: 0 (warning), 1 (reminder), 2 (critical).
The following example means the alarm level belongs to reminder.
`{\"Value\":\"AND\",\"Type\":\"Operation\",\"Children\":[{\"Type\":\"Condition\",\"Value\":\"Level\",\"Children\":[{\"Value\":\"In\",\"Type\":\"Compare\"},{\"Value\":\"[1]\",\"Type\":\"Value\"}]}]}`

-Type: Condition means rule condition. Value: NotifyType refers to notification type.
-Sub-node Type supports `Compare`, and Value supports `In` and `NotIn`.
-Supported values for the next sub-node value: 1 (alarm notification), 2 (recovery notification).
The following example means the notification type belongs to alarm notification or the notification type is not within restoration notification.
`{\"Value\":\"AND\",\"Type\":\"Operation\",\"Children\":[{\"Value\":\"OR\",\"Type\":\"Operation\",\"Children\":[{\"Type\":\"Condition\",\"Value\":\"NotifyType\",\"Children\":[{\"Value\":\"In\",\"Type\":\"Compare\"},{\"Value\":\"[1]\",\"Type\":\"Value\"}]},{\"Type\":\"Condition\",\"Value\":\"NotifyType\",\"Children\":[{\"Value\":\"NotIn\",\"Type\":\"Compare\"},{\"Value\":\"[2]\",\"Type\":\"Value\"}]}]}]}`

-Type: Condition means rule condition. Value: AlarmID indicates alarm policy.
-Sub-node Type supports `Compare`, and Value supports `In` and `NotIn`.
-Supported values for the next sub-node value: alarm policy id array.
The following example means: The alarm policy belongs to alarm-53af048c-254b-4c73-bb48-xxx, alarm-6dfa8bc5-08da-4d64-b6cb-xxx or the alarm policy does not belong to alarm-1036314c-1e49-4cee-a8fb-xxx.
`"{\"Value\":\"AND\",\"Type\":\"Operation\",\"Children\":[{\"Value\":\"OR\",\"Type\":\"Operation\",\"Children\":[{\"Type\":\"Condition\",\"Value\":\"AlarmID\",\"Children\":[{\"Value\":\"In\",\"Type\":\"Compare\"},{\"Value\":\"[\\\"alarm-53af048c-254b-4c73-bb48-xxx\\\",\\\"alarm-6dfa8bc5-08da-4d64-b6cb-xxx\\\"]\",\"Type\":\"Value\"}]},{\"Type\":\"Condition\",\"Value\":\"AlarmID\",\"Children\":[{\"Value\":\"NotIn\",\"Type\":\"Compare\"},{\"Value\":\"[\\\"alarm-1036314c-1e49-4cee-a8fb-xxx\\\"]\",\"Type\":\"Value\"}]}]}]}"`

-Type: Condition means the rule condition. Value: AlarmName means the alarm policy name.
-Sub-node Type supports `Compare`, and Value supports `=~`, `!=~`
-Next sub-node value supported values: Must be a regular expression.
The following example means the alarm policy name regular expression matching ^test$ or the alarm policy name regular expression mismatch ^hahaha$.
`{\"Value\":\"AND\",\"Type\":\"Operation\",\"Children\":[{\"Value\":\"OR\",\"Type\":\"Operation\",\"Children\":[{\"Type\":\"Condition\",\"Value\":\"AlarmName\",\"Children\":[{\"Value\":\"=~\",\"Type\":\"Compare\"},{\"Value\":\"^test$\",\"Type\":\"Value\"}]},{\"Type\":\"Condition\",\"Value\":\"AlarmName\",\"Children\":[{\"Value\":\"!=~\",\"Type\":\"Compare\"},{\"Value\":\"^hahaha$\",\"Type\":\"Value\"}]}]}]}`

-Type: Condition means rule condition. Value: Label refers to alarm classification field.
- The sub-node Type supports `Compare`, and Value supports `In`, `NotIn`, `=~`, `!=~`.
-Supported values for the next sub-node value: `In`, `NotIn` where value is an array, `=~`, `!=~` where value is a regex.
The following example means: the alarm classification field key1 belongs to v1, or the alarm classification field key2 NOT_IN v2, or the alarm classification field key3 matches the regular expression ^test$, or the alarm classification field key4 does not match the regular expression ^hahaha$.
`{\"Value\":\"AND\",\"Type\":\"Operation\",\"Children\":[{\"Value\":\"OR\",\"Type\":\"Operation\",\"Children\":[{\"Type\":\"Condition\",\"Value\":\"Label\",\"Children\":[{\"Value\":\"key1\",\"Type\":\"Key\"},{\"Value\":\"In\",\"Type\":\"Compare\"},{\"Value\":\"[\\\"v1\\\"]\",\"Type\":\"Value\"}]},{\"Type\":\"Condition\",\"Value\":\"Label\",\"Children\":[{\"Value\":\"key2\",\"Type\":\"Key\"},{\"Value\":\"NotIn\",\"Type\":\"Compare\"},{\"Value\":\"[\\\"v2\\\"]\",\"Type\":\"Value\"}]},{\"Type\":\"Condition\",\"Value\":\"Label\",\"Children\":[{\"Value\":\"key3\",\"Type\":\"Key\"},{\"Value\":\"=~\",\"Type\":\"Compare\"},{\"Value\":\"^test$\",\"Type\":\"Value\"}]},{\"Type\":\"Condition\",\"Value\":\"Label\",\"Children\":[{\"Value\":\"key4\",\"Type\":\"Key\"},{\"Value\":\"!=~\",\"Type\":\"Compare\"},{\"Value\":\"^hahaha$\",\"Type\":\"Value\"}]}]}]}`

-Type: Condition means Rule Condition. Value: NotifyTime refers to notification time.
- Sub-node Type supports `Compare`, and Value supports `Between`, `NotBetween`
-Next sub-node value supported values: An array of strings with a length of 2 in the format `14:20:36`.
The following example indicates the notification time is within the specified scope 14:18:36 to 14:33:36 or not within specified range 14:20:36 to 14:30:36.
`{\"Value\":\"AND\",\"Type\":\"Operation\",\"Children\":[{\"Value\":\"OR\",\"Type\":\"Operation\",\"Children\":[{\"Type\":\"Condition\",\"Value\":\"NotifyTime\",\"Children\":[{\"Value\":\"Between\",\"Type\":\"Compare\"},{\"Value\":\"[\\\"14:18:36\\\",\\\"14:33:36\\\"]\",\"Type\":\"Value\"}]},{\"Type\":\"Condition\",\"Value\":\"NotifyTime\",\"Children\":[{\"Value\":\"NotBetween\",\"Type\":\"Compare\"},{\"Value\":\"[\\\"14:20:36\\\",\\\"14:30:36\\\"]\",\"Type\":\"Value\"}]}]}]}`

-Type: Condition means the rule condition. Value: Duration indicates the duration of the alarm.
-The sub-node Type supports `Compare`, and Value supports `>`, `<`, `>=`, `<=`.
-Next sub-node value supported values: integer value in minutes
The following example means: the duration of the alarm is greater than 1 minute, equal to or greater than 2 minutes, less than 3 minutes, or less than or equal to 4 minutes.
`{\"Value\":\"AND\",\"Type\":\"Operation\",\"Children\":[{\"Value\":\"OR\",\"Type\":\"Operation\",\"Children\":[{\"Type\":\"Condition\",\"Value\":\"Duration\",\"Children\":[{\"Value\":\">\",\"Type\":\"Compare\"},{\"Value\":1,\"Type\":\"Value\"}]},{\"Type\":\"Condition\",\"Value\":\"Duration\",\"Children\":[{\"Value\":\">=\",\"Type\":\"Compare\"},{\"Value\":2,\"Type\":\"Value\"}]},{\"Type\":\"Condition\",\"Value\":\"Duration\",\"Children\":[{\"Value\":\"<\",\"Type\":\"Compare\"},{\"Value\":3,\"Type\":\"Value\"}]},{\"Type\":\"Condition\",\"Value\":\"Duration\",\"Children\":[{\"Value\":\"<=\",\"Type\":\"Compare\"},{\"Value\":4,\"Type\":\"Value\"}]}]}]}`
     */
    public void setRule(String Rule) {
        this.Rule = Rule;
    }

    /**
     * Get Alarm notification recipient information. 
     * @return NoticeReceivers Alarm notification recipient information.
     */
    public NoticeReceiver [] getNoticeReceivers() {
        return this.NoticeReceivers;
    }

    /**
     * Set Alarm notification recipient information.
     * @param NoticeReceivers Alarm notification recipient information.
     */
    public void setNoticeReceivers(NoticeReceiver [] NoticeReceivers) {
        this.NoticeReceivers = NoticeReceivers;
    }

    /**
     * Get Alarm notification template callback information, including WeCom, DingTalk, and Lark. 
     * @return WebCallbacks Alarm notification template callback information, including WeCom, DingTalk, and Lark.
     */
    public WebCallback [] getWebCallbacks() {
        return this.WebCallbacks;
    }

    /**
     * Set Alarm notification template callback information, including WeCom, DingTalk, and Lark.
     * @param WebCallbacks Alarm notification template callback information, including WeCom, DingTalk, and Lark.
     */
    public void setWebCallbacks(WebCallback [] WebCallbacks) {
        this.WebCallbacks = WebCallbacks;
    }

    /**
     * Get Alarm escalation switch. `true`: enable alarm escalation, `false`: disable alarm escalation. Default: false. 
     * @return Escalate Alarm escalation switch. `true`: enable alarm escalation, `false`: disable alarm escalation. Default: false.
     */
    public Boolean getEscalate() {
        return this.Escalate;
    }

    /**
     * Set Alarm escalation switch. `true`: enable alarm escalation, `false`: disable alarm escalation. Default: false.
     * @param Escalate Alarm escalation switch. `true`: enable alarm escalation, `false`: disable alarm escalation. Default: false.
     */
    public void setEscalate(Boolean Escalate) {
        this.Escalate = Escalate;
    }

    /**
     * Get Alarm escalation conditions. `1`: Unclaimed and unrecovered, `2`: Unrecovered. Default is 1.
-Unclaimed and unrecovered: Upgrade if the alert is not restored and no one claims it.
-Unrecovered: Upgrade if the alarm persists without recovery.
 
     * @return Type Alarm escalation conditions. `1`: Unclaimed and unrecovered, `2`: Unrecovered. Default is 1.
-Unclaimed and unrecovered: Upgrade if the alert is not restored and no one claims it.
-Unrecovered: Upgrade if the alarm persists without recovery.

     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set Alarm escalation conditions. `1`: Unclaimed and unrecovered, `2`: Unrecovered. Default is 1.
-Unclaimed and unrecovered: Upgrade if the alert is not restored and no one claims it.
-Unrecovered: Upgrade if the alarm persists without recovery.

     * @param Type Alarm escalation conditions. `1`: Unclaimed and unrecovered, `2`: Unrecovered. Default is 1.
-Unclaimed and unrecovered: Upgrade if the alert is not restored and no one claims it.
-Unrecovered: Upgrade if the alarm persists without recovery.

     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get Escalate alarms interval. Unit: minutes, range `[1, 14400]`. 
     * @return Interval Escalate alarms interval. Unit: minutes, range `[1, 14400]`.
     */
    public Long getInterval() {
        return this.Interval;
    }

    /**
     * Set Escalate alarms interval. Unit: minutes, range `[1, 14400]`.
     * @param Interval Escalate alarms interval. Unit: minutes, range `[1, 14400]`.
     */
    public void setInterval(Long Interval) {
        this.Interval = Interval;
    }

    /**
     * Get Notification channel configuration for the next step after alarm severity escalation. 
     * @return EscalateNotice Notification channel configuration for the next step after alarm severity escalation.
     */
    public EscalateNoticeInfo getEscalateNotice() {
        return this.EscalateNotice;
    }

    /**
     * Set Notification channel configuration for the next step after alarm severity escalation.
     * @param EscalateNotice Notification channel configuration for the next step after alarm severity escalation.
     */
    public void setEscalateNotice(EscalateNoticeInfo EscalateNotice) {
        this.EscalateNotice = EscalateNotice;
    }

    public NoticeRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NoticeRule(NoticeRule source) {
        if (source.Rule != null) {
            this.Rule = new String(source.Rule);
        }
        if (source.NoticeReceivers != null) {
            this.NoticeReceivers = new NoticeReceiver[source.NoticeReceivers.length];
            for (int i = 0; i < source.NoticeReceivers.length; i++) {
                this.NoticeReceivers[i] = new NoticeReceiver(source.NoticeReceivers[i]);
            }
        }
        if (source.WebCallbacks != null) {
            this.WebCallbacks = new WebCallback[source.WebCallbacks.length];
            for (int i = 0; i < source.WebCallbacks.length; i++) {
                this.WebCallbacks[i] = new WebCallback(source.WebCallbacks[i]);
            }
        }
        if (source.Escalate != null) {
            this.Escalate = new Boolean(source.Escalate);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Interval != null) {
            this.Interval = new Long(source.Interval);
        }
        if (source.EscalateNotice != null) {
            this.EscalateNotice = new EscalateNoticeInfo(source.EscalateNotice);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Rule", this.Rule);
        this.setParamArrayObj(map, prefix + "NoticeReceivers.", this.NoticeReceivers);
        this.setParamArrayObj(map, prefix + "WebCallbacks.", this.WebCallbacks);
        this.setParamSimple(map, prefix + "Escalate", this.Escalate);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamObj(map, prefix + "EscalateNotice.", this.EscalateNotice);

    }
}

