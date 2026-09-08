/*
 * Copyright 2025 HM Revenue & Customs
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package uk.gov.hmrc.ui.pages.businessPages.PrerequisitePages

import org.openqa.selenium.By
import uk.gov.hmrc.ui.conf.TestConfiguration
import uk.gov.hmrc.ui.pages.BasePage
import uk.gov.hmrc.ui.pages.CommonPages.AuthWizard.click
import uk.gov.hmrc.ui.util.TestDataConstants.*
import uk.gov.hmrc.ui.util.Urls.GRS_PARTNERSHIP

object PartnershipPage extends BasePage {

  override def pageUrl: String =
    s"${TestConfiguration.url("host")}/identify-your-partnership/test-only/feature-switches"

  override def pageTitle: String = "Choose which features to enable."

  val btnSubmit: By = By.cssSelector("button[type='submit'].govuk-button")

  private def ensureChecked(elementId: String): Unit =
    try {
      val elem = driver.findElement(By.id(elementId))
      try
        if (!elem.isSelected) {
          elem.click()
        }
      catch {
        case _: Throwable =>
          try
            elem.click()
          catch {
            case _: Throwable => ()
          }
      }
    } catch {
      case _: Throwable =>
    }

  def openEntityValidationService(): Unit = {
    navigateToPage(GRS_PARTNERSHIP)
    ensureChecked("feature-switch.business-verification-stub")
    ensureChecked("feature-switch.companies-house-stub")
    ensureChecked("feature-switch.partnership-known-facts-stub")
    ensureChecked("feature-switch.register-with-identifiers-stub")

    for (i <- 1 to noOfIterations) {
      Thread.sleep(waitFor10Secs)
      try
        click(btnSubmit)
      catch {
        case _: org.openqa.selenium.StaleElementReferenceException => ()
      }
    }
  }
}
