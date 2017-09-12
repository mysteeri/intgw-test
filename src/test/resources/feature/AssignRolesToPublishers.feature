Feature: Assign Publisher Roles to Publishers

	@assignPublisherRoles
  Scenario Outline: Assign operator-admin-roles to operators
    Given I am in identity server page
    When I enter identity server username credentials
    And I click on identity server sign in
    Then I should see the ids Home page header as "WSO2Telco Hub Home"
    When I click on identity server Main tab
    And I click on identity server Configuration Users and Roles List link
    Then I should see ids Configuration menu with first item as "Users and Roles"
    When I click carbon server User Management Users link
    Then I should see carbon User Management Users page header as "Users"
    When I enter identity server Search Users to Enter user name pattern as "<usertype>"
    And I click on identity server Users search button
    Then I should see the "<usertype>" on ids Users search area
    And I click on ids Users assign roles link under "<usertype>"
    Then I should see the ids List of roles page table header as "Unassigned Roles"
    When I checked the ids List of roles "<roleType>" check box
    And I click on ids List of roles finish button
    Then ids List of roles Role update success message should pop up "successfully."
    When I click on List of roles Role update success message ok button

  Examples:
    |usertype      |roleType|
    |PUBLISHER1ADMIN|pub-dep1|
    |PUBLISHER1ADMIN|manage-app-admin|
    |PUBLISHER2ADMIN|pub-dep2|
   |PUBLISHER2ADMIN|manage-app-admin|
   
   
   
   
   	@assignPublisherRolesOnDialog
  Scenario Outline: Assign operator-admin-roles to operators
    Given I am in identity server page
    When I enter identity server username credentials
    And I click on identity server sign in
    Then I should see the ids Home page header as "WSO2Telco Hub Home"
    When I click on identity server Main tab
    And I click on identity server Configuration Users and Roles List link
    Then I should see ids Configuration menu with first item as "Users and Roles"
    When I click carbon server User Management Users link
    Then I should see carbon User Management Users page header as "Users"
    When I enter identity server Search Users to Enter user name pattern as "<usertype>"
    And I click on identity server Users search button
    Then I should see the "<usertype>" on ids Users search area
    And I click on ids Users assign roles link under "<usertype>"
    Then I should see the ids List of roles page table header as "Unassigned Roles"
    When I checked the ids List of roles "<roleType>" check box
    And I click on ids List of roles finish button
    Then ids List of roles Role update success message should pop up "successfully."
    When I click on List of roles Role update success message ok button

  Examples:
    |usertype      |roleType|
    |DialogPUBGITCC_user|pub-gitcc|
    |DialogPUBGITCC_user|manage-app-admin|
    |DialogPUBGITSoftware_user|pub-gitsoftware|
    |DialogPUBGITSoftware_user|manage-app-admin|
    |DialogPUBGITCRM_user|pub-gitcrm|
   |DialogPUBGITCRM_user|manage-app-admin|
   |DialogPUBGTechCONP_user|pub-gteckconp|
   |DialogPUBGTechCONP_user|pub-conp|
   |DialogPUBGITCRM_user|manage-app-admin|
   |DialogPUBGIT-Infra_user|pub-GIT-Infra|
   |DialogPUBGIT-Infra_user|manage-app-admin|
   |DialogPUBGITPSI_user|pub-gitpsi|
   |DialogPUBGITPSI_user|manage-app-admin|
   