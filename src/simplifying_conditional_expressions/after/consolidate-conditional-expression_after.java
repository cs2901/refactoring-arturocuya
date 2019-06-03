bool isNotEligible() {
  return seniority < 2 && monthsDisabled > 12 && isPartTime;
}

double disabilityAmount() {
  if (isNotEligible()) {
    return 0;
  }
  // Compute the disability amount.
  // ...
}
